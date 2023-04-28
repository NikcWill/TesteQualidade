#language:pt

Funcionalidade: Acessar Google

  Contexto:
      Dado que o usuário instanciou o chrome-drive

    Cenário: Acessar Google
      Dado que o usuário digitou o endereço do Google no navegador
      Quando clicar em Enter
      Então a página do Google deve abrir