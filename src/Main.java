import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends JFrame {

	
	private JPanel contentPane;

	private ListPessoasMaiores pmaiores = new ListPessoasMaiores();
	private ListPessoasMenores pmenores = new ListPessoasMenores();
	private Pessoa p;
	
	
	public ListPessoasMenores getPmenores() {
		return pmenores;
	}

	public void setPmenores(ListPessoasMenores pmenores) {
		this.pmenores = pmenores;
	}

	public ListPessoasMaiores getPmaiores() {
		return pmaiores;
	}

	public void setPmaiores(ListPessoasMaiores pmaiores) {
		this.pmaiores = pmaiores;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro pt = new Cadastro(pmaiores, pmenores);
				Cadastro.newScreen();
				
			}
		});
		
		JTextPane text_caixa_prioritario = new JTextPane();
		text_caixa_prioritario.setEnabled(false);
		
		JButton btn_caixa_prioritario = new JButton("Caixa priorit\u00E1rio");
		btn_caixa_prioritario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pmaiores.sizePessoas() == 0){
					if(pmenores.sizePessoas() == 0){
						text_caixa_prioritario.setText("Não há pessoas na fila");
					}else{
						p = pmenores.getPessoaFila();						
						pmenores.excluiDaFila();
						text_caixa_prioritario.setText(p.toString());
					}
				}else{
					p = pmaiores.getPessoaFila();	
					pmaiores.excluiDaFila();
					text_caixa_prioritario.setText(p.toString());			
				}
				
				System.out.println(pmaiores);
			}
		});
		
		
		JTextPane text_caixa_normal = new JTextPane();
		text_caixa_normal.setEnabled(false);
		
		JButton btn_caixa_normal = new JButton("Caixa normal");
		btn_caixa_normal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pmenores.sizePessoas() == 0){
					text_caixa_normal.setText("Não há pessoas na Fila");
				}else{
					p = pmenores.getPessoaFila();	
					pmenores.excluiDaFila();
					text_caixa_normal.setText(p.toString());
				}
				
				System.out.println(pmenores);
			}
		});
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn_caixa_prioritario)
								.addComponent(text_caixa_prioritario, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
								.addComponent(btn_caixa_normal)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(text_caixa_normal, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn_caixa_prioritario)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(text_caixa_prioritario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(btn_caixa_normal)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(text_caixa_normal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
