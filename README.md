
# curso-Java

• git clone https://github.com/cristianoalice/curso-Java.git


1) Abra o terminal ou Git Bash e vá até a pasta onde está o seu projeto.
D:\curso_Java_Ultimate

2)  git pull origin master (para atualizar na máquina local o código mais recente que consta no github)

3) Agora, transformar essa minha pasta em um repositório Git.
Pra isso, basta digitar **git init** e dar enter.

4) Para adicionar uma origin, executar o comando:
git remote add origin https://github.com/cristianoalice/curso_Java_Ultimate.git

5) **git status** (comando muito utilizado)
Quando houver um arquivo novo, ele mostrará que o arquivo não está monitorado pelo Git.

6) git add *  ou git add "nome do arquivo + extensão"
(Este comando prepara para o commit)

7)  git commit -m "nome do commit"
(exemplo: git commit -m "java_curso_22.10")

8) git push -u origin master (para hospedar no github)
