package compiler;

public class FourElement {
    int id;// ��Ԫʽ��ţ�Ϊ��̷���
    String op;// ������
    String arg1;// ��һ��������
    String arg2;// �ڶ���������
    Object result;// ���

    public FourElement() {

    }

    public FourElement(int id, String op, String arg1, String arg2, String result) {
        this.id = id;
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }
}