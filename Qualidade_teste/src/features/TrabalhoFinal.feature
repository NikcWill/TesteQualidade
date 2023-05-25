#language:pt

Funcionalidade: Cadastrar usuario e acessar o site da empresa Nexxera Florianópolis


    Contexto:
        Dado que o usuário instanciou o chrome-driver



    @Validar_formulario
    Esquema do Cenário: Os campos Nome, Sobrenome e Sexo são obrigatórios
        Dado que o usuário prencheu os <elementos> com as <informações>
        Quando clicar em Cadastrar
        Então deve apresentar o formulário preenchido com as <informações>
        Exemplos:
         |  elementos                                                                            | informações     |
         | nome, sobrenome, sexo, comida preferida, escolaridade, esporte que pratica, sugestão  | Jonh, Kenedy, 0, 2, superior, Corrida, Sugestão de mais feriados no ano! |





    @acessar_site_nexxera
    Cenário: Acessar Nexxera Florianópolis através de pesquisa google
        Dado que o usuário pesquisou pela empresa Nexxera Florianópolis no google
        E que retornou pesquisas relacionadas a empresa Nexxera Florianópolis
        Quando clicar no site da empresa Nexxera
        Então deve acessar o site da Nexxera

