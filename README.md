# 🧑‍🚀 Soma Rustica
Algoritmo recursivo que simula a operação de soma.


## 📝 Enunciado:
Fazer, em Java, uma aplicação que resolva a soma de dois números naturais, sem a utilização de uma
operação de soma (seja uma função aritmética ou oriunda que qualquer classe ou biblioteca), mas
utilizando, apenas uma função recursiva de soma de 2 números. <br>

O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

---

## Como usar:

### Clone esse repositório:
```bash
git clone https://github.com/GabrielGit10110/Soma_Rustica.git
```
### Entre no diretório:
```bash
cd Soma_Rustica
```

### ⚙️ Como compilar:
1. Transforme todos os arquivos.java em arquivos.class:
```bash
javac -s src -d dist src/controller/SomaRusticaController.java src/view/SomaRustica.java
```

2. Execute:
```bash
java -cp dist view.SomaRustica
``` 

*@ Opcional - Compilação para jar:*
1. Crie um MANIFEST.txt e adicione o caminho correto para a classe Main:
```bash
touch MANIFEST.txt
echo 'Main-Class: view.SomaRustica' > MANIFEST.txt
```

2. Faca a compilação para jar:
```bash
jar -cvfm SomaRustica.jar MANIFEST.txt -C dist .
```

3. Execute o jar:
```bash
java -jar SerieRecursiva.jar
```
