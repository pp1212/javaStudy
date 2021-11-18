package com.sist.dept;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DeptTest extends JFrame {
	JFrame f;
	
	JTextField jtf_dno;
	JTextField jtf_dname;
	JTextField jtf_dloc;
	
	JTable table;
	Vector colNames;
	Vector<Vector> rowData;
	
	DeptDAO dao;
	
	public void loadList() {
		ArrayList<DeptVO> list = dao.listAll();
		rowData.clear();
		for(DeptVO d:list) {
			Vector v = new Vector();
			v.add(d.getDno());
			v.add(d.getDname());
			v.add(d.getDloc());
			rowData.add(v);
		}
		table.updateUI();
	}
	
	public DeptTest() {
		f = this;
		dao = new DeptDAO();
		
		jtf_dno = new JTextField();
		jtf_dname = new JTextField();
		jtf_dloc = new JTextField();
		
		colNames = new Vector();
		colNames.add("�μ���ȣ");
		colNames.add("�μ��̸�");
		colNames.add("�μ���ġ");
		
		rowData = new Vector<Vector>();
		
		table = new JTable(rowData, colNames);
		
		JPanel p_input = new JPanel();
		JPanel p_button = new JPanel();
		JPanel p_center = new JPanel();
		
		p_input.setLayout(new GridLayout(3,2));
		p_input.add(new JLabel("�μ���ȣ:"));
		p_input.add(jtf_dno);
		p_input.add(new JLabel("�μ��̸�:"));
		p_input.add(jtf_dname);
		p_input.add(new JLabel("�μ���ġ:"));
		p_input.add(jtf_dloc);
		
		JButton btn_insert = new JButton("�߰�");
		JButton btn_select = new JButton("���");
		JButton btn_update = new JButton("����");
		JButton btn_delete = new JButton("����");
		p_button.add(btn_insert);
		p_button.add(btn_select);
		p_button.add(btn_update);
		p_button.add(btn_delete);
		
		p_center.setLayout(new BorderLayout());
		p_center.add(p_input,BorderLayout.CENTER);
		p_center.add(p_button,BorderLayout.SOUTH);
		
		JScrollPane jsp = new JScrollPane(table);
		
		add(p_center,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = table.getSelectedRow();
				Vector v = rowData.get(index);
				jtf_dno.setText(v.get(0)+"");
				jtf_dname.setText(v.get(1)+"");
				jtf_dloc.setText(v.get(2)+"");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		btn_insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int dno = Integer.parseInt(jtf_dno.getText());
				String dname = jtf_dname.getText();
				String dloc = jtf_dloc.getText();
				
				DeptVO d = new DeptVO(dno, dname, dloc);
				int re = dao.insert(d);
				if(re == 1) {
					JOptionPane.showMessageDialog(f, "�μ��� ����Ͽ����ϴ�.");
					//ù ��° �Ű��������� �����Ӱ�ü�� �����ؾ� ��
					//�ڱ� ����� ActionListener�������̽��� ������ ��ü�̰� Frame�� �ƴ�
					//this�ϸ� ����,�ɹ��� �����Ӻ��� ����� �װ��� ����
					loadList();
				}else {
					JOptionPane.showMessageDialog(jsp, "�μ���Ͽ� �����Ͽ����ϴ�.");
				}
			}});
		btn_select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loadList();
			}});
		btn_update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int dno = Integer.parseInt(jtf_dno.getText());
				String dname = jtf_dname.getText();
				String dloc = jtf_dloc.getText();
				
				DeptVO d = new DeptVO(dno, dname, dloc);
				int re = dao.update(d);
				if(re == 1) {
					JOptionPane.showMessageDialog(f, "�μ��� �����Ͽ����ϴ�.");
					loadList();
				}else {
					JOptionPane.showMessageDialog(jsp, "�μ������� �����Ͽ����ϴ�.");
				}
			}});
		btn_delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int dno = Integer.parseInt(jtf_dno.getText());
								
				int re = dao.delete(dno);
				if(re > 0) {	//(primary key�� �������ؼ� ����)�����Ȱ� �������� �� �����ϱ�
					JOptionPane.showMessageDialog(f, "�μ��� �����Ͽ����ϴ�.");
					loadList();
				}else {
					JOptionPane.showMessageDialog(jsp, "�μ������� �����Ͽ����ϴ�.");
				}
			}});
		
	}
	
	public static void main(String[] args) {
		new DeptTest();
	}

}