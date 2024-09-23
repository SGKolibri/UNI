#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Estrutura de um Usuário
typedef struct User
{
    char nome[50];
    char email[50];
    char cidade[30];
    int idade;
    double peso;
    double altura;
    char nivelDeProficiencia[15]; // Iniciante, Intermediário, Avançado
    struct User *prox;            // Ponteiro para o próximo usuário
} User;

User *criarUsuario(char *nome, char *email, char *cidade, int idade, double peso, double altura, char *nivelDeProficiencia)
{
    User *novoUsuario = (User *)malloc(sizeof(User)); // Alocação dinâmica
    if (novoUsuario == NULL)
    {
        printf("Erro ao alocar memoria!\n");
        exit(1);
    }
    strcpy(novoUsuario->nome, nome);
    strcpy(novoUsuario->email, email);
    strcpy(novoUsuario->cidade, cidade);
    novoUsuario->idade = idade;
    novoUsuario->peso = peso;
    novoUsuario->altura = altura;
    strcpy(novoUsuario->nivelDeProficiencia, nivelDeProficiencia);
    novoUsuario->prox = NULL; // Inicializa o próximo user como NULL
    return novoUsuario;
}

// Função para inserir um usuário na lista encadeada
User *inserirUsuario(User *lista, char *nome, char *email, char *cidade, int idade, double peso, double altura, char *nivelDeProficiencia)
{
    User *novoUsuario = criarUsuario(nome, email, cidade, idade, peso, altura, nivelDeProficiencia);
    novoUsuario->prox = lista; // O novo usuário aponta para o antigo "primeiro" da lista
    return novoUsuario;        // Retorna o novo "primeiro" da lista
}

// Função para imprimir as informações dos usuários na lista
void imprimirUsuarios(User *lista)
{
    User *atual = lista;
    while (atual != NULL)
    {
        printf("Nome: %s\n", atual->nome);
        printf("Email: %s\n", atual->email);
        printf("Cidade: %s\n", atual->cidade);
        printf("Idade: %d\n", atual->idade);
        printf("Peso: %.2f\n", atual->peso);
        printf("Altura: %.2f\n", atual->altura);
        printf("Nivel de Proficiencia: %s\n\n", atual->nivelDeProficiencia);
        atual = atual->prox; // Para o próximo usuário
    }
}

// Libera a memória da lista encadeada
void liberarLista(User *lista)
{
    User *atual = lista;
    while (atual != NULL)
    {
        User *temp = atual;
        atual = atual->prox;
        free(temp); // Libera a memória do usuário atual
    }
}

int main()
{
    // Inicia a lista de usuários vazia
    User *listaUsuarios = NULL;

    // Insere usuários na lista
    listaUsuarios = inserirUsuario(listaUsuarios, "Joao da Silva", "joao@email.com", "Anapolis", 25, 72.5, 1.75, "Intermediario");
    listaUsuarios = inserirUsuario(listaUsuarios, "Maria Souza", "maria@email.com", "Anapolis", 30, 65.0, 1.68, "Avancado");
    listaUsuarios = inserirUsuario(listaUsuarios, "Pedro Oliveira", "pedro@email.com", "Corumba", 22, 80.0, 1.80, "Iniciante");

    printf("Lista de Usuarios:\n\n");
    imprimirUsuarios(listaUsuarios);

    liberarLista(listaUsuarios);

    return 0;
}
