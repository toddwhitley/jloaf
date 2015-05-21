package jloaf.tb;

import org.jLOAF.casebase.CaseBase;
import org.jLOAF.casebase.CaseRun;
import org.jLOAF.reasoning.BacktrackingReasoning;
import org.jLOAF.reasoning.SequentialReasoning;

import jloaf.BaselineTest;

public class ReactiveBooleanVariableK extends BaselineTest{
	
	private static String problemRunString[] = {
		"0.1 1",
		"0.2 2",
	};
	
	private static String cbString[] = {
		"0.1 1",
		"0.2 2",
		"",
		"0.1 1",
		"0.2 2",
		"",
		"0.1 1",
		"0.3 3",
	};
	
	@Override
	public String[] getProblemString() {
		return problemRunString;
	}

	@Override
	public String[] getCaseBaseString() {
		return cbString;
	}
	@Override
	public BacktrackingReasoning buildReasoning(CaseBase cb, CaseRun problemRun){
		return new SequentialReasoning(cb, problemRun, 3);
	}
}
