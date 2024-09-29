public class ex1 {
	// Declaração da Classe Pessoa
	public static class Pessoa {
		private String nome; // Atributos privados da Classe Pessoa
		private String cpf;
		private String dataNascimento;
	
			public String getNome() {
				return nome; // Acessa Nome privado para as Classes herdeiras
			}
			
			public void setNome(String nome) {
				this.nome = nome; // Permite a modificação do Nome privado para as Classes herdeiras
			}
			
			public String getCPF() {
				return cpf; // Acessa CPF privado para as Classes herdeiras
			}
			
			public void setCPF(String cpf) {
				this.cpf = cpf; // Permite a modificação do CPF privado para as Classes herdeiras
			}
			
			public String getdataNascimento() {
				return dataNascimento; // Acessa a Data de Nascimento privado para as Classes herdeiras
			}
			
			public void setdataNascimento(String dataNascimento) {
				this.dataNascimento = dataNascimento; // Permite a modificação da Data de Nascimento privado para as Classes herdeiras
			}
		
	}
	
	// Declara a Classe Vendedor, herdando a Classe Pessoa
	public static class PessoaVendedor  extends Pessoa {
		private String dataContratacao; // Atributos da Classe Vendedor
		private double salariobase;
		private double comissao;
	
		// Construtor da Classe Vendedor
		public PessoaVendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salariobase, double comissao) {
			setNome(nome); // Inicializa o Nome pela Classe Pai "Pessoa"
 			setCPF(cpf); // Inicializa o CPF pela Classe Pai "Pessoa"
			setdataNascimento(dataNascimento); // Inicializa a Data de Nsscimento da Classe Pai "Pessoa"
			this.dataContratacao=dataContratacao; // Inicializa a Data de Contratação da Classe Vendedor
			this.salariobase=salariobase; // Inicializa o Salário Base da Classe Vendedor
			this.comissao=comissao; // Inicializa a Comissão da Classe Vendedor
		}
		
		
		// Método para Exibir os Dados da Classe Vendedor
		public void DescricaoVendedor() {
			System.out.println("- Vendedor -");
			System.out.println("Nome: "+getNome()); // Exibe o Nome do Vendedor
			System.out.println("CPF: "+getCPF()); // Exibe o CPF do Vendedor
			System.out.println("Data de Nascimento: "+getdataNascimento()); // Exibe a Data de Nascimento do Vendedor
			System.out.println("Data de Contratação: "+dataContratacao); // Exibe a Data de Contratação do Vendedor
			System.out.println("Salário Base: "+salariobase); // Exibe o Salário Base do Vendedor
			System.out.println("Comissão: "+comissao+"%"); // Exibe o percentual de Comissão do Vendedor
		}
	}
	
	// Declara a Classe Gerente, herdando a Classe Pessoa
	public static class PessoaGerente extends Pessoa {
		private String dataContratacao; // Atributos da Classe Gerente
		private double salariobase;
		private String departamento;
		
		// Construtor da Classe Gerente
		public PessoaGerente (String nome, String cpf, String dataNascimento, String dataContratacao, double salariobase, String departamento) {
			setNome(nome); // Inicializa o Nome pela Classe "Pai" Pessoa
			setCPF(cpf); // Inicializa o CPF pela Classe "Pai" Pessoa
			setdataNascimento(dataNascimento); // Inicializa a Data de Nascimento pela Classe "Pai" Pessoa
			this.dataContratacao=dataContratacao; // Inicializa da Data de Contratação da Classe Gerente
			this.salariobase=salariobase; // Inicializa o Salario Base da Classe Gerente
			this.departamento=departamento; // Inicializa o Departamento da Classe Gerente
		}
		
		// Método para Exibir os Dados da Classe Gerente
		public void DescricaoGerente() {
			System.out.println("\n- Gerente -");
			System.out.println("Nome: "+getNome()); // Exibe o Nome do Gerente
			System.out.println("CPF: "+getCPF()); // Exibe o CPF do Gerente
			System.out.println("Data de Nascimento: "+getdataNascimento()); // Exibe a Data de Nascimento do Gerente
			System.out.println("Data de Contratação"+dataContratacao); // Exibe a Data de Contratação do Gerente
			System.out.println("Salário Base: "+salariobase); // Exibe o Salário Base do Gerente
			System.out.println("Departamento: "+departamento); // Exibe o Departamento do Gerente
		}
		
	}
	
	// Declara a Classe Cliente, herdando a Classe Pessoa
	public static class Cliente extends Pessoa{
		private String email; // Atributos da Classe Cliente
		private int numeroCartao;
		private String telefone;
	
		// Construtor da Classe Cliente
		public Cliente (String nome, String cpf, String dataNascimento, String email, int numeroCartao, String telefone) {
			setNome(nome); // Inicializa o Nome pela Classe "Pai" Pessoa
			setCPF(cpf); // Inicializa o CPF pela Classe "Pai" Pessoa
			setdataNascimento(dataNascimento); // Inicializa a Data de Nascimento pela Classe "Pai" Pessoa
			this.email=email; // Inicializa o Email da Classe Cliente
			this.numeroCartao=numeroCartao; // Inicializa o Número do Cartão Fidelidade da Classe Cliente
			this.telefone=telefone; // Inicializa o Telefone da Classe Cliente
		}
		
		// Método de Decrição do Cliente
		public void DescricaoCliente() {
			System.out.println("\n- Cliente -");
			System.out.println("Nome: "+getNome()); // Exibe o Nome do Cliente
			System.out.println("CPF: "+getCPF()); // Exibe o CPF do Cliente
			System.out.println("Data de Nascimento: "+getdataNascimento()); // Exibe a Data de Nascimento do Cliente
			System.out.println("Email: "+email); // Exibe o Email do Cliente
			System.out.println("Número do Cartão Fidelidade: "+numeroCartao); // Exibe o Número do Cartão Fidelidade do Cliente
			System.out.println("Telefone: "+telefone); // Exibe o Telefone do Cliente
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PessoaVendedor vendedor1 = new PessoaVendedor("Miguel Luís Alves", "293.145.542-36", "06/07/2000", "19/10/2022", 2000.00, 10); 
		
		PessoaGerente gerente1 = new PessoaGerente("Lúcia Valentina Bianca Brito", "40.214.506-9", "17/09/1998", "22/08/2024", 2000.00, "Administrativo"); 
		
		Cliente cliente1 = new Cliente("Vera Tatiane Moraes", "13.343.340-7", "04/04/1983", "vera@gmail.com", 5245587, "(15) 99867-9870"); 
		
		vendedor1.DescricaoVendedor();
		gerente1.DescricaoGerente();
		cliente1.DescricaoCliente();

	}

}

