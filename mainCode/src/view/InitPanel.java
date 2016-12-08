package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

import control.*;
import valueObject.*;

@SuppressWarnings("serial")
public class InitPanel extends JFrame {
  JFrame frame = this;
  SearchRecipeManager serchRecipeManager = new SearchRecipeManager();
  Container con = getContentPane();

  // SearchRecipe hashmap = new SearchRecipe();
  // Ingredient ingredient;
  // Recipe recipe;

  JLabel titlelabel = new JLabel("JESSI:������ �����ϴ� ������");
  JPanel initPanel = new JPanel(); // ���� ū��
  JPanel mainPanel = new JPanel(); // ����
  JPanel rightPanel = new JPanel(); // ������
  JPanel pastePanel = new JPanel(); // ���
  JPanel meatPanel = new JPanel(); // ����
  JPanel seafoodPanel = new JPanel(); // �ػ깰
  JPanel vagetablePanel = new JPanel(); // ä�ҷ�
  JPanel sortButtonPanel = new JPanel(); // ������ ���� ��ư��
  JPanel saucePanel = new JPanel(); // ���̷�
  JPanel herbPanel = new JPanel(); // ������
  JPanel leftPanel = new JPanel(); // ���� + ���ÿϷ�
  JPanel selectPanel = new JPanel(); // ��� ����

  JButton selectButton = new JButton("���ÿϷ�");
  JButton accuracyButton = new JButton("��Ȯ����");
  JButton alphButton = new JButton("�����ټ�");
  JButton likeButton = new JButton("���ƿ��");
  JButton searchButton = new JButton("�˻�");
  JTextField serchTextField = new JTextField(10);

  String colName[] = { "����", "������ �̸�", "��Ȯ��", "���ƿ� ��" };

  private OkButtonListener okButtonListener;
  private SearchButtonListener searchButtonListener;

  public JCheckBox pig;
  public JCheckBox beef;
  public JCheckBox chicken;
  public JCheckBox gochujang;
  public JCheckBox soysauce;
  public JCheckBox doenjang;
  public JCheckBox eggplant;
  public JCheckBox mushroom;
  public JCheckBox carrot;
  public JCheckBox pumpkin;
  public JCheckBox paprika;
  public JCheckBox garlic;
  public JCheckBox onion;
  public JCheckBox lotusRoot;
  public JCheckBox ginger;
  public JCheckBox scallion;
  public JCheckBox ChubMackerel;
  public JCheckBox seaweed;
  public JCheckBox mussel;
  public JCheckBox ManilaClam;
  public JCheckBox squid;
  public JCheckBox shrimp;
  public JCheckBox crab;
  public JCheckBox hairtail;
  public JCheckBox sugar;
  public JCheckBox salt;
  public JCheckBox pepper;
  public JCheckBox ChiliPowder;
  public JCheckBox StarchSyrup;
  public JCheckBox vinegar;
  public JCheckBox OysterSauce;
  public JCheckBox BeanSprouts;
  public JCheckBox GreenBeanSprouts;
  public JCheckBox bracken;
  public JCheckBox spinach;

  public IngredientView ingredientView;

  public InitPanel() throws IOException {
    this.setTitle("JESSI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TypeView typeView = new TypeView();
    typeView.getList();
    IngredientView ingredientView = new IngredientView();
    ingredientView.getList();
    ingredientView.clearSelectlist(); // ���� selectlist.txt �ʱ�ȭ
    RecipeView recipeView = new RecipeView();

    okButtonListener = new OkButtonListener(ingredientView, recipeView);
    searchButtonListener = new SearchButtonListener();

    initPanel.setLayout(new BorderLayout());
    initPanel.setSize(1000, 700);
    titlelabel.setSize(500, 50);
    initPanel.add(titlelabel, BorderLayout.NORTH);
    initPanel.add(mainPanel, BorderLayout.CENTER);

    mainPanel.setLayout(new GridLayout(0, 2));
    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

    meatPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "����", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.pig = new JCheckBox("�������");
    this.beef = new JCheckBox("�Ұ��");
    this.chicken = new JCheckBox("�߰��");

    meatPanel.add(pig);
    meatPanel.add(beef);
    meatPanel.add(chicken);

    pastePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "���", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.gochujang = new JCheckBox("������");
    this.soysauce = new JCheckBox("����");
    this.doenjang = new JCheckBox("����");

    pastePanel.add(gochujang);
    pastePanel.add(soysauce);
    pastePanel.add(doenjang);

    vagetablePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "ä�ҷ�", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.eggplant = new JCheckBox("����");
    this.mushroom = new JCheckBox("����");
    this.carrot = new JCheckBox("���");
    this.pumpkin = new JCheckBox("ȣ��");
    this.paprika = new JCheckBox("������ī");
    this.garlic = new JCheckBox("����");
    this.onion = new JCheckBox("����");
    this.lotusRoot = new JCheckBox("����");
    this.ginger = new JCheckBox("����");
    this.scallion = new JCheckBox("��");

    vagetablePanel.add(eggplant);
    vagetablePanel.add(mushroom);
    vagetablePanel.add(carrot);
    vagetablePanel.add(pumpkin);
    vagetablePanel.add(paprika);
    vagetablePanel.add(garlic);
    vagetablePanel.add(onion);
    vagetablePanel.add(lotusRoot);
    vagetablePanel.add(ginger);
    vagetablePanel.add(scallion);

    seafoodPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "�ػ깰", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.ChubMackerel = new JCheckBox("����");
    this.seaweed = new JCheckBox("�̿�");
    this.mussel = new JCheckBox("ȫ��");
    this.ManilaClam = new JCheckBox("������");
    this.squid = new JCheckBox("��¡��");
    this.shrimp = new JCheckBox("����");
    this.crab = new JCheckBox("�ɰ�");
    this.hairtail = new JCheckBox("��ġ");

    seafoodPanel.add(ChubMackerel);
    seafoodPanel.add(seaweed);
    seafoodPanel.add(mussel);
    seafoodPanel.add(ManilaClam);
    seafoodPanel.add(squid);
    seafoodPanel.add(shrimp);
    seafoodPanel.add(crab);
    seafoodPanel.add(hairtail);

    saucePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "���̷�", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.sugar = new JCheckBox("����");
    this.salt = new JCheckBox("�ұ�");
    this.pepper = new JCheckBox("����");
    this.ChiliPowder = new JCheckBox("���尡��");
    this.StarchSyrup = new JCheckBox("����");
    this.vinegar = new JCheckBox("����");
    this.OysterSauce = new JCheckBox("���ҽ�");

    saucePanel.add(sugar);
    saucePanel.add(salt);
    saucePanel.add(pepper);
    saucePanel.add(ChiliPowder);
    saucePanel.add(StarchSyrup);
    saucePanel.add(vinegar);
    saucePanel.add(OysterSauce);

    herbPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "������", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.BeanSprouts = new JCheckBox("�ᳪ��");
    this.GreenBeanSprouts = new JCheckBox("���ֳ���");
    this.bracken = new JCheckBox("��縮");
    this.spinach = new JCheckBox("�ñ�ġ");

    herbPanel.add(BeanSprouts);
    herbPanel.add(GreenBeanSprouts);
    herbPanel.add(bracken);
    herbPanel.add(spinach);

    selectPanel.setLayout(new GridLayout(6, 0));
    selectPanel.add(pastePanel);
    selectPanel.add(meatPanel);
    selectPanel.add(seafoodPanel);
    selectPanel.add(vagetablePanel);
    selectPanel.add(saucePanel);
    selectPanel.add(herbPanel);

    leftPanel.setLayout(new BorderLayout());
    leftPanel.add(selectPanel, BorderLayout.CENTER);
    leftPanel.add(selectButton, BorderLayout.SOUTH);

    rightPanel.setLayout(new BorderLayout());
    sortButtonPanel.setLayout(new FlowLayout());

    selectButton.addActionListener(okButtonListener);
    searchButton.addActionListener(searchButtonListener);

    rightPanel.add(sortButtonPanel, BorderLayout.NORTH);

    sortButtonPanel.add(accuracyButton);
    sortButtonPanel.add(alphButton);
    sortButtonPanel.add(likeButton);
    sortButtonPanel.add(serchTextField);
    sortButtonPanel.add(searchButton);

    JTable table;
    JScrollPane scroll; // ���̺� ���� �� ���� �־�����~ scroll
    String[][] data; // 3���� ������ ���� 2���� �迭�� �����Ѵ�.
    String[] title = { "��ȣ", "������ �̸�", "�����ġ����", "���ƿ�" }; // �÷��� ���� ������ ǥ���� 1����
                                                           // �迭

    data = new String[35][4];

    table = new JTable(data, title); // table=new JTable(������-2�����迭, �÷��迭);
    scroll = new JScrollPane(table);
    rightPanel.add(scroll);

    serchRecipeManager.setJTable(table);
    con.add(initPanel);

    setVisible(true);
    setSize(1000, 700);

  }

  // search with Vector
  public class OkButtonListener implements ActionListener {
    private IngredientView ingredientView;
    private RecipeView recipeView;
    private Vector<IngredientInfo> selectlist;
    Vector<RecipeInfo> resultlist;

    public OkButtonListener(IngredientView ingredientView, RecipeView recipeView) throws IOException {
      this.ingredientView = ingredientView;
      this.recipeView = recipeView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      try {
        ingredientView.clearSelectlist(); // ���� selectlist.txt �ʱ�ȭ
      } catch (IOException e2) {
        e2.printStackTrace();
      } 
      ingredientView.setSelectlist(pig);
      ingredientView.setSelectlist(beef);
      ingredientView.setSelectlist(chicken);
      ingredientView.setSelectlist(gochujang);
      ingredientView.setSelectlist(soysauce);
      ingredientView.setSelectlist(doenjang);
      ingredientView.setSelectlist(eggplant);
      ingredientView.setSelectlist(mushroom);
      ingredientView.setSelectlist(carrot);
      ingredientView.setSelectlist(pumpkin);
      ingredientView.setSelectlist(paprika);
      ingredientView.setSelectlist(garlic);
      ingredientView.setSelectlist(onion);
      ingredientView.setSelectlist(lotusRoot);
      ingredientView.setSelectlist(ginger);
      ingredientView.setSelectlist(scallion);
      ingredientView.setSelectlist(ChubMackerel);
      ingredientView.setSelectlist(seaweed);
      ingredientView.setSelectlist(mussel);
      ingredientView.setSelectlist(ManilaClam);
      ingredientView.setSelectlist(squid);
      ingredientView.setSelectlist(shrimp);
      ingredientView.setSelectlist(crab);
      ingredientView.setSelectlist(hairtail);
      ingredientView.setSelectlist(sugar);
      ingredientView.setSelectlist(salt);
      ingredientView.setSelectlist(pepper);
      ingredientView.setSelectlist(ChiliPowder);
      ingredientView.setSelectlist(StarchSyrup);
      ingredientView.setSelectlist(vinegar);
      ingredientView.setSelectlist(OysterSauce);
      ingredientView.setSelectlist(BeanSprouts);
      ingredientView.setSelectlist(GreenBeanSprouts);
      ingredientView.setSelectlist(bracken);
      ingredientView.setSelectlist(spinach);

      try {
        this.selectlist = ingredientView.getSelectlist();
        // System.out.println(selectlist); //test
      } catch (IOException e1) {

        e1.printStackTrace();
      }
      resultlist = recipeView.search(selectlist);
      recipeView.showTableData(resultlist, serchRecipeManager.getJTable()); // ������ ���� �����Ǹ� �˻��ϰ� ��� ����Ʈ�� ����Ѵ�.
    }
  }

  // search with hashmap method
  public class SearchButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      serchRecipeManager.initialize();
      serchRecipeManager.getHashmap().getRecipeNameInHashmap(serchTextField.getText(), serchRecipeManager.getJTable(),
          frame);

    }
  }

  public class likeButtonListener implements ActionListener {
    RecipeView recipeView;
    JTable table;
    Vector<RecipeInfo> resultlist;

    public likeButtonListener(RecipeView recipeView, JTable table) {
      this.recipeView = recipeView;
      this.table = table;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      resultlist = recipeView.sortLike(table);
      //recipeView.showTableData(resultlist);
    }

  }

}
