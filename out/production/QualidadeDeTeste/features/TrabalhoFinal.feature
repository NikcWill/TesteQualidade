#language:pt

Funcionalidade: Cadastrar usuario e acessar o site da empresa Nexxera Florianópolis


    Contexto:
        Dado que o usuário instanciou o chrome-driver
    @acessar_site_nexxera
    Cenário: Acessar Nexxera Florianópolis através de pesquisa google
        Dado que o usuário pesquisou pela empresa Nexxera Florianópolis no google
        E que retornou pesquisas relacionadas a empresa Nexxera Florianópolis
        Quando clicar no site da empresa Nexxera
        Então deve acessar o site da Nexxera

