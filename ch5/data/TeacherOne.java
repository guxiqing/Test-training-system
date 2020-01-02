package ch5.data;
import javax.swing.*;
public class TeacherOne implements Teacher {
    public void giveTestPaparScore(TestPaper testPaper){
        int correctAmount=0;     //百分比记分
        if(testPaper==null){
            JOptionPane.showMessageDialog(null,"没答题","消息对话框",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Problem p[] = testPaper.getAllProblem();
        if(p==null||p.length==0){
            JOptionPane.showMessageDialog(null,"没答题","消息对话框",JOptionPane.WARNING_MESSAGE);
            return;
        }
        for(int i=0;i<p.length;i++){
            boolean b = compare(p[i].getUserAnswer(),p[i].getCorrectAnswer());
            if(b){
                correctAmount++;
            }
        }
        double result = (double)correctAmount/(double)p.length;
        int r =(int)(result*100);
        String s = "共有:"+p.length+"道题."+"您做对了"+correctAmount+"题,"+"正确率大约"+r+"%";
        JLabel mess = new JLabel(s);
        JOptionPane.showMessageDialog(null,mess,"成绩",JOptionPane.PLAIN_MESSAGE);
    }
    private boolean compare(String s,String t){
        boolean isTure = true;
        for(int i=0;i<s.length();i++){
            String temp = ""+s.charAt(i);
            if(!(t.contains(temp)))
                isTure = false;
        }
        for(int i=0;i<t.length();i++){
            String temp = ""+t.charAt(i);
            if(!(s.contains(temp)))
                isTure = false;
        }
        return isTure;
    }
}