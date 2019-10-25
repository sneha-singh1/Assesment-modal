package web.localad.modal;

import java.io.Serializable;

public class Option implements Serializable {
	private int id;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private String optionF;
	private String optionG;
	private String optionH;
	private String optionI;
	private String optionJ;
	private String optionK;
	private String optionL;
	private char answer;
	private char selectedAnswer;

	public Option(){
		
	}

	public Option(int id, String question, String optionA, String optionB, String optionC, String optionD,
			String optionE, String optionF, String optionG, String optionH, String optionI, String optionJ,
			String optionK, String optionL, char answer, int i) {
		super();
		this.id = id;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.optionG = optionG;
		this.optionH = optionH;
		this.optionI = optionI;
		this.optionJ = optionJ;
		this.optionK = optionK;
		this.optionL = optionL;
		this.answer = answer;
		this.selectedAnswer = (char) i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getOptionE() {
		return optionE;
	}

	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}

	public String getOptionF() {
		return optionF;
	}

	public void setOptionF(String optionF) {
		this.optionF = optionF;
	}

	public String getOptionG() {
		return optionG;
	}

	public void setOptionG(String optionG) {
		this.optionG = optionG;
	}

	public String getOptionH() {
		return optionH;
	}

	public void setOptionH(String optionH) {
		this.optionH = optionH;
	}

	public String getOptionI() {
		return optionI;
	}

	public void setOptionI(String optionI) {
		this.optionI = optionI;
	}

	public String getOptionJ() {
		return optionJ;
	}

	public void setOptionJ(String optionJ) {
		this.optionJ = optionJ;
	}

	public String getOptionK() {
		return optionK;
	}

	public void setOptionK(String optionK) {
		this.optionK = optionK;
	}

	public String getOptionL() {
		return optionL;
	}

	public void setOptionL(String optionL) {
		this.optionL = optionL;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public char getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(char selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}


}
