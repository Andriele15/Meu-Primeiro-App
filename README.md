<h1 align="center">Meu primeiro projeto em Mobile</h1>

![fuelLogo](https://github.com/user-attachments/assets/e6141a1b-d5e4-4a15-831a-7a79886a6b13)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)
![Badge em Linguagem](http://img.shields.io/static/v1?label=LINGUAGEM&message=EM%20JAVA&color=GREEN&style=for-the-badge)
![Badge em TIPO](http://img.shields.io/static/v1?label=IDE&message=Android%20Studio&color=GREEN&style=for-the-badge)

## 📱 Descrição e Funcionabilidades 🔧 -

![calculo](https://github.com/user-attachments/assets/c2637e1a-08e7-4d1a-9f19-af3673c2e823)

O FUEL SAVER permite ao usuário calcular seu consumo e o valor total da viagem com base na distância e no valor da gasolina. Ele também exibe a mensagem de listros necessários e custo da viagem.

-`Interface de Usuário Intuitiva`:

O aplicativo utiliza ConstraintLayout para organizar os componentes de forma responsiva, garantindo uma experiência de usuário fluida em diferentes tamanhos de tela.
Os campos de entrada (EditText) possuem dicas visuais que orientam o usuário sobre o tipo de dados a serem inseridos.

-`Validação de Entrada`:

Antes de realizar os cálculos, o aplicativo valida se todos os campos necessários estão preenchidos, evitando erros de execução e melhorando a usabilidade.

-`Cálculo de Combustível`:

O cálculo do combustível necessário e do custo total da viagem é realizado com base na fórmula:
Litros necessários = Distância / Consumo
Custo da viagem = Litros necessários * Preço por litro
Os resultados são formatados e exibidos de forma clara para o usuário, com duas casas decimais.
Feedback ao Usuário:

O aplicativo utiliza Toast para fornecer feedback em tempo real ao usuário, informando sobre campos obrigatórios não preenchidos.

 ## 🚀 Tecnologias Utilizadas -

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.
## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/Meu-Primeiro-App.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app


│   ├── src


│   │   ├── main


│   │   │   ├──
java/br/ulbra/fuelsaver_calculadoradeconbustivel


│   │   │  
│   ├── MainActivity.java      
# Atividade principal com o cálculo dos litros necessários e do custo da viagem


│   │   │   ├──
res


│   │   │  
│   ├── layout


│   │   │  
│   │   ├── activity_main.xml   #
Layout da tela principal


│   │   │  
│   └── values


│   │   │  
│       ├──
strings.xml         # Strings usadas no
app


│   │   │  
│       ├── colors.xml          # Cores definidas no projeto


│   └── build.gradle                        # Configuração do
Gradle


└── README.md                               # Este arquivo

````
## 👨‍💻 Desenvolvedores –

Andriele Pacheco - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT

Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
