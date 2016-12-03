package view;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
   
@SuppressWarnings("serial")
public class InitPanel extends JFrame{
  
  Container con = getContentPane();
  
  JLabel titlelabel = new JLabel("JESSI:������ �����ϴ� ������");
  JPanel panel1 = new JPanel(); // ���� ū��
  JPanel panel2 = new JPanel(); // ����
  JPanel panel3 = new JPanel(); // ������
  JPanel panel4 = new JPanel(); // ���
  JPanel panel5 = new JPanel(); // ����
  JPanel panel6 = new JPanel(); // �ػ깰
  JPanel panel7 = new JPanel(); // ä�ҷ�
  JPanel panel8 = new JPanel(); // ������ ���� ��ư��
  JPanel panel9 = new JPanel(); // ���� + ���ÿϷ�
  JPanel panel0 = new JPanel(); // ��� ����
  JPanel panel11 = new JPanel(); // ���̷�
  JPanel panel12 = new JPanel(); // ������
  JButton select = new JButton("���ÿϷ�");
  String colName[] = {"����", "������ �̸�", "��Ȯ��", "���ƿ� ��"};
  
  public InitPanel(){
    this.setTitle("JESSI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel1.setLayout(new BorderLayout());
    panel1.setSize(1000,700);
    titlelabel.setSize(500, 50);
    panel1.add(titlelabel, BorderLayout.NORTH);
    panel1.add(panel2, BorderLayout.CENTER);
        
    panel2.setLayout(new GridLayout(0, 2));
    panel2.add(panel9);
    panel2.add(panel3);
    
    panel5.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "����", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox pig = new JCheckBox("�������");
    JCheckBox cow = new JCheckBox("�Ұ��");
    JCheckBox chicken = new JCheckBox("�߰��");
    
    panel5.add(pig);
    panel5.add(cow);
    panel5.add(chicken);
    
    panel4.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "���", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox gochujang = new JCheckBox("������");
    JCheckBox ganjang= new JCheckBox("����");
    JCheckBox doenjang = new JCheckBox("����");
    
    panel4.add(gochujang);
    panel4.add(ganjang);
    panel4.add(doenjang);
    
    panel7.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "ä�ҷ�", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox eggplant = new JCheckBox("����");
    JCheckBox mushroom = new JCheckBox("����");
    JCheckBox carrot = new JCheckBox("���");
    JCheckBox pumpkin = new JCheckBox("ȣ��");
    JCheckBox paprika = new JCheckBox("������ī");
    JCheckBox garlic = new JCheckBox("����");
    JCheckBox onion = new JCheckBox("����");
    JCheckBox chili = new JCheckBox("����");
    JCheckBox ginger = new JCheckBox("����");
    JCheckBox scallion = new JCheckBox("��");
    
    panel7.add(eggplant);
    panel7.add(mushroom);
    panel7.add(carrot);
    panel7.add(pumpkin);
    panel7.add(paprika);
    panel7.add(garlic);
    panel7.add(onion);
    panel7.add(chili);
    panel7.add(ginger);
    panel7.add(scallion);
    
    panel6.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "�ػ깰", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox ChubMackerel = new JCheckBox("����");
    JCheckBox seaweed = new JCheckBox("�̿�");
    JCheckBox mussel = new JCheckBox("ȫ��");
    JCheckBox ManilaClam = new JCheckBox("������");
    JCheckBox squid = new JCheckBox("��¡��");
    JCheckBox shrimp = new JCheckBox("����");
    JCheckBox crab = new JCheckBox("�ɰ�");
    JCheckBox hairtail = new JCheckBox("��ġ");
    
    panel6.add(ChubMackerel);
    panel6.add(seaweed);
    panel6.add(mussel);
    panel6.add(ManilaClam);
    panel6.add(squid);
    panel6.add(shrimp);
    panel6.add(crab);
    panel6.add(hairtail);
    
    panel11.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "���̷�", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox sugar = new JCheckBox("����");
    JCheckBox salt = new JCheckBox("�ұ�");
    JCheckBox pepper = new JCheckBox("����");
    JCheckBox ChiliPowder = new JCheckBox("���尡��");
    JCheckBox StarchSyrup = new JCheckBox("����");
    JCheckBox vinegar = new JCheckBox("����");
    JCheckBox OysterSauce = new JCheckBox("���ҽ�");
    
    panel11.add(sugar);
    panel11.add(salt);
    panel11.add(pepper);
    panel11.add(ChiliPowder);
    panel11.add(StarchSyrup);
    panel11.add(vinegar);
    panel11.add(OysterSauce);
    
    panel12.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "������", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox BeanSprouts = new JCheckBox("�ᳪ��");
    JCheckBox GreenBeanSprouts = new JCheckBox("���ֳ���");
    JCheckBox bracken = new JCheckBox("��縮");
    JCheckBox spinach = new JCheckBox("�ñ�ġ");
    
    panel12.add(BeanSprouts);
    panel12.add(GreenBeanSprouts);
    panel12.add(bracken);
    panel12.add(spinach);
    
    panel9.setLayout(new BorderLayout());
    panel9.add(panel0, BorderLayout.CENTER);
    panel9.add(select, BorderLayout.SOUTH);
    panel0.setLayout(new GridLayout(6,0));
    panel0.add(panel4);
    panel0.add(panel5);
    panel0.add(panel6);
    panel0.add(panel7);
    panel0.add(panel11);
    panel0.add(panel12);
    
    panel3.setLayout(new BorderLayout());
    panel8.setLayout(new FlowLayout());
    
    
    JButton accuracy  = new JButton("��Ȯ����");
    JButton alph = new JButton("�����ټ�");
    JButton like = new JButton("���ƿ��");
    JButton serchbutton = new JButton("�˻�");
    JTextField serch = new JTextField(10);
    
    
    
    panel3.add(panel8, BorderLayout.NORTH);
    
    
    panel8.add(accuracy);
    panel8.add(alph);
    panel8.add(like);
    panel8.add(serch);
    panel8.add(serchbutton);
    
     JTable table;
     JScrollPane scroll; // ���̺� ���� �� ���� �־�����~ scroll
     String[] [] data; // 3���� ������ ���� 2���� �迭�� �����Ѵ�.
     String[] title = {"��ȣ","������ �̸�","��Ȯ�� ��","���ƿ� ��"}; //�÷��� ���� ������ ǥ���� 1���� �迭

      data = new String[35][4];
      
      table=new JTable(data,title); // table=new JTable(������-2�����迭, �÷��迭);
      scroll = new JScrollPane(table);
      panel3.add(scroll);

    con.add(panel1);
    
    
    setVisible(true);
    setSize(1000,700);
  }
}

