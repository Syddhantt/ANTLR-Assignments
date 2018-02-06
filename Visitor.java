

import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitor extends progBaseVisitor<Object> 
{
	int level=-1;
	ArrayList<HashMap<String, Object>> listofHashmaps = new ArrayList<HashMap<String, Object>>();
	ArrayList<HashMap<String, String>> DecsriptorHashmapList = new ArrayList<HashMap<String, String>>();
    HashMap<String, ArrayList> funcInfo = new HashMap<String, ArrayList>(); 	
    HashMap<String, Object> passedValues = new HashMap<String, Object>();
	 
	@Override public Object visitStart(progParser.StartContext ctx) 
	{
		level++;
		HashMap<String, Object> memory = new HashMap<String, Object>();
		HashMap<String, String> descriptor = new HashMap<String, String>();
		listofHashmaps.add(level, memory);
		DecsriptorHashmapList.add(level, descriptor);
          
		Object a = visitChildren(ctx);

		level--;

		return a;

	
	}

    
    @Override public Object visitVarCheck(progParser.VarCheckContext ctx) 
	{
		HashMap<String, Object> memory = listofHashmaps.get(level);
		HashMap<String, String> descriptor = DecsriptorHashmapList.get(level);
		boolean isVarDeclared = memory.containsKey(ctx.strvar1.getText());
		if (isVarDeclared)
		{
			System.err.println("\n" + ctx.strvar1.getText() + " is already declared");
			System.exit(0);
		}
		else
		{
			memory.put(ctx.strvar1.getText(), 0);
			//System.out.println(ctx.strvar1.getText() + " was inserted");
			descriptor.put(ctx.strvar1.getText(), ctx.strtype.getText());			
		}	
		if(ctx.strvar2 !=null)
		{
			boolean isVarDeclared1 = memory.containsKey(ctx.strvar2.getText());
			if (isVarDeclared1)
			{
				System.err.println("\n" + ctx.strvar2.getText() + " is already declared");
				System.exit(0);
			}
			else
			{
					memory.put(ctx.strvar2.getText(), 0);
					//System.out.println(ctx.strvar2.getText() + " was inserted");
					descriptor.put(ctx.strvar2.getText(), ctx.strtype.getText());
			}
		}
		return visitChildren(ctx); 
	}
	
	@Override public Object visitInput(progParser.InputContext ctx) 
	{ 
		Integer input1; 
		Scanner readInput1 = new Scanner(System.in); 
		input1 = readInput1.nextInt();
		boolean flag1 = false;
		for(int i=listofHashmaps.size()-1;i>=0;i--)
		{
			if(listofHashmaps.get(i).containsKey(ctx.v1.getText()))
			{
				listofHashmaps.get(i).put(ctx.v1.getText(), (input1));
				//System.out.println("Value inserted: " + ctx.v1.getText() + " --> " + input1);
				flag1=true;
				break;
			}
		}
		if(flag1==false)
		{
			System.err.println("\n" + ctx.v1.getText() + " was never declared");
		    System.exit(0);
		}
			
		if(ctx.v2 !=null)
		{
			Integer input2; 
			Scanner readInput2 = new Scanner(System.in); 
			input2 = readInput2.nextInt(); 
			boolean flag2 = false;
			for(int i=0;i<listofHashmaps.size();i++)
		    {
				if(listofHashmaps.get(i).containsKey(ctx.v2.getText()))
			    {
				listofHashmaps.get(i).put(ctx.v2.getText(), (input2));
				System.out.println("Value inserted: " + ctx.v2.getText() + " --> " + input2);
				flag2=true;
				break;
			    }
		    }
		    if(flag2==false)
		    {
			System.err.println("\n" + ctx.v2.getText() + " was never declared");
		    System.exit(0);
		    }
			
		}
		/*for(int i=0;i<listofHashmaps.size();i++)
		{
			Object[] keyset = listofHashmaps.get(i).keySet().toArray();
			for (int j=0; j<keyset.length; j++) {
					System.out.println("Value retrieved: " + keyset[j].toString() + " --> " + listofHashmaps.get(i).get(keyset[j].toString()));			
			}
		}*/
		return visitChildren(ctx); 
	 
	}
	
	
	@Override public Object visitAdditionexp(progParser.AdditionexpContext ctx) 
	{ 
	  double value = Double.parseDouble(this.visit(ctx.first).toString()) + Double.parseDouble(this.visit(ctx.next).toString());
	  return value; 
	}
	
	@Override public Object visitSubexp(progParser.SubexpContext ctx) 
	{ 
	  double value = Double.parseDouble(this.visit(ctx.first).toString()) - Double.parseDouble(this.visit(ctx.next).toString());
	  return value;  
	}
	
	@Override public Object visitMulexp(progParser.MulexpContext ctx) 
	{ 
	  double value = Double.parseDouble(this.visit(ctx.first).toString()) * Double.parseDouble(this.visit(ctx.next).toString());
	  //System.out.println("value: " + value);
	  return value; 
	}
	
	@Override public Object visitDivexp(progParser.DivexpContext ctx) 
	{ 
	  double value = Double.parseDouble(this.visit(ctx.first).toString()) / Double.parseDouble(this.visit(ctx.next).toString());
	  return value;  
	}
	
	@Override public Object visitAssign1(progParser.Assign1Context ctx) 
	{
		double value =  Double.parseDouble(this.visit(ctx.first).toString());
		return value; 
	}
	
	@Override public Object visitAssign2(progParser.Assign2Context ctx) 
	{
		double value =  Double.parseDouble(this.visit(ctx.first).toString());
		return value; 
	}
	
	@Override public Object visitAssign3(progParser.Assign3Context ctx) 
	{
		Object value = null;
		 for(int i=listofHashmaps.size()-1;i>=0;i--)
		{
			if(listofHashmaps.get(i).containsKey(ctx.n.getText()))
			{
				value =  listofHashmaps.get(i).get(ctx.n.getText());
				break;
			}
		}
		return value; 
	}
	
	@Override public Object visitAssign4(progParser.Assign4Context ctx) 
	{ 
	Object value = ctx.no.getText();
	return value; 
	}
	
	@Override public Object visitS(progParser.SContext ctx) 
	{ 
	     String str = ctx.getText();
         str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
         return str; 
	}
	
	@Override public Object visitLet(progParser.LetContext ctx) 
	{
		Object value = this.visit(ctx.simpleexpression());
		for(int i=listofHashmaps.size()-1;i>=0;i--)
		{
			if(listofHashmaps.get(i).containsKey(ctx.v1.getText()))
			{
				HashMap<String, String> descriptor = DecsriptorHashmapList.get(level);
				listofHashmaps.get(i).put(ctx.v1.getText(), value);
				break;
			}
		}
		
		
	
	return null; 
	}
	
	@Override public Object visitPrintVar(progParser.PrintVarContext ctx) { 
		Object value = null;
		String str = ctx.CHKSTRING().getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
		System.out.print(str);
		if(ctx.strvar2 != null) {
		for(int i=listofHashmaps.size()-1;i>=0;i--)
		{
			if(listofHashmaps.get(i).containsKey(ctx.strvar2.getText()))
			{
				value =  listofHashmaps.get(i).get(ctx.strvar2.getText());
				break;
			}
		}
		    System.out.println(value.toString());
		} 
		/*else if(ctx.funcCall() != null) 
		{
		 Value value = this.visit(ctx.funcCall());
		 System.out.println(value.asString());
		} */
		else 
		{
		 System.out.println();
		}
		 return null;
	}
	
	@Override public Object visitPrintFuncCall(progParser.PrintFuncCallContext ctx) {
		Object value = null;
		String str = ctx.CHKSTRING().getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
		System.out.print(str);
		if(ctx.functionCall() != null) {
			value = this.visit(ctx.functionCall());
		    System.out.println(value.toString());
		} 
		/*else if(ctx.funcCall() != null) 
		{
		 Value value = this.visit(ctx.funcCall());
		 System.out.println(value.asString());
		} */
		else 
		{
		 System.out.println();
		}
		 return null;
	}
	
	@Override public Object visitIf_else(progParser.If_elseContext ctx) 
	{
		Object evaluatedBlock = this.visit(ctx.condition());
		 
		if(Boolean.parseBoolean(evaluatedBlock.toString()))
		{
			this.visit(ctx.ifstart);
		}
		else
		{
			if(ctx.elsestart!=null)
			{
				this.visit(ctx.elsestart);
			}
			
		}
	
	return null; 
	}
	
	@Override public Object visitWhile_loop(progParser.While_loopContext ctx) 
	{
		Object evaluatedBlock = this.visit(ctx.condition()); 
		while(Boolean.parseBoolean(evaluatedBlock.toString()))
		{
			this.visit(ctx.whilestart);
			evaluatedBlock = this.visit(ctx.condition());
		}
	
	return null;
	}
	
	@Override public Object visitExpRelational(progParser.ExpRelationalContext ctx) 
	{
        if(ctx.op.getText().equals("<="))
		{
			Object lhs = this.visit(ctx.e1);
			Object rhs = this.visit(ctx.e2);
			return (Double.parseDouble(lhs.toString())<=Double.parseDouble(rhs.toString()));
		}
		else if(ctx.op.getText().equals(">="))
		{
			Object lhs = this.visit(ctx.e1);
			Object rhs = this.visit(ctx.e2);
			return (Double.parseDouble(lhs.toString())>=Double.parseDouble(rhs.toString()));
			
		}
		else if(ctx.op.getText().equals(">"))
		{
			Object lhs = this.visit(ctx.e1);
			Object rhs = this.visit(ctx.e2);
			return (Double.parseDouble(lhs.toString())>Double.parseDouble(rhs.toString()));
				
		}
		else if(ctx.op.getText().equals("-"))
		{
			Object lhs = this.visit(ctx.e1);
			Object rhs = this.visit(ctx.e2);
			
			return (Double.parseDouble(lhs.toString())-Double.parseDouble(rhs.toString()));
			
		}
		else
		{
			Object lhs = this.visit(ctx.e1);
			Object rhs = this.visit(ctx.e2);
			return (Double.parseDouble(lhs.toString())<Double.parseDouble(rhs.toString()));
				
		}
	 
	}
	
	@Override public Object visitFor_stat(progParser.For_statContext ctx) 
	{
		int counter = Integer.parseInt(ctx.num2.getText());
		Object evaluatedBlock = this.visit(ctx.condition()); 
		boolean flag = Boolean.parseBoolean(evaluatedBlock.toString());
		for(int i=listofHashmaps.size()-1;i>=0;i--)
		    {
				if(listofHashmaps.get(i).containsKey(ctx.v.getText()))
				{
					listofHashmaps.get(i).put(ctx.v.getText(),ctx.num1.getText());
					break;
				}
			}
		while(flag)
		{
			Object value = null;
			for(int i=listofHashmaps.size()-1;i>=0;i--)
		    {
				if(listofHashmaps.get(i).containsKey(ctx.v.getText()))
				{
					value =  listofHashmaps.get(i).get(ctx.v.getText());
					listofHashmaps.get(i).put(ctx.v.getText(),Integer.parseInt(value.toString())+counter);
					break;
				}
			}
			this.visit(ctx.forstart);
			evaluatedBlock = this.visit(ctx.condition());
			flag = Boolean.parseBoolean(evaluatedBlock.toString());
			
		}
		
		
		
	return null; 
	}
	
	
	
	@Override public Object visitE(progParser.EContext ctx) 
	{ 
	   Object e = this.visit(ctx.exp);
	   return (Double.parseDouble(e.toString())); 
	}
	
	@Override public Object visitB(progParser.BContext ctx) 
	{
		if (ctx.flag.getText()=="true")
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	@Override public Object visitV(progParser.VContext ctx) 
	{ 
		Object value = null;
		for(int i=listofHashmaps.size()-1;i>=0;i--)
		{
			if(listofHashmaps.get(i).containsKey(ctx.v1.getText()))
			{
				value =  listofHashmaps.get(i).get(ctx.v1.getText());
				break;
			}
		}
	
	return value; 
	}
	
	@Override public Object visitN(progParser.NContext ctx) 
	{ 
		Object num = ctx.NUMBER().getText();
		
	return num;
	}
	
	@Override public Object visitFunctionCall(progParser.FunctionCallContext ctx) 
	{ 
		Object childValue = null;
		ArrayList funcValues = funcInfo.get(ctx.VAR().getText());
		if(ctx.argumentList().expression().size()==((List<progParser.ExpressionContext>)funcValues.get(0)).size()) 
		{
			HashMap<String, Object> memory = listofHashmaps.get(level);
			for(int i=0;i<ctx.argumentList().expression().size();i++) 
			{
				List<progParser.ExpressionContext> arg = ctx.argumentList().expression();
				Object value = visit(arg.get(i));
				memory.put(((List<TerminalNode>)funcValues.get(0)).get(i).getText(), value);
			}
			ParseTree parentBlock = (ParseTree)funcValues.get(1);
			List<progParser.StatementsContext> statements = ((progParser.StartContext) parentBlock).statements();
			for(progParser.StatementsContext statement : statements) {
				childValue = this.visit(statement);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		+		return childValue;
	}
	
	@Override public Object visitFunction(progParser.FunctionContext ctx) 
	{ 
	    ArrayList funcValues = new ArrayList();
		funcValues.add(0,ctx.parameterList().VAR());
		funcValues.add(1,ctx.funcStart);
		funcInfo.put(ctx.VAR().getText(),funcValues);
		return null; 
	}
	
	@Override public Object visitReturn_stat(progParser.Return_statContext ctx) { 
		Object returnValue = this.visit(ctx.simpleexpression());
		return returnValue;
	}
   
    }
