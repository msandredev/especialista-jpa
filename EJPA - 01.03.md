# Instalação do MySQL Workbench

Para meu ambiente utilizei o tutorial abaixo.

Link: https://computingforgeeks.com/install-and-use-mysql-workbench-on-ubuntu/?expand_article=1

Basicamente consiste em:

1. Baixar o MySQL Workbench:
    ```bash 
    wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
    ```
2. Executar o arquivo baixado que fará a configuração para habilitar o repositório no Linux:
    ```bash
    ### Installation with dpkg ###
    sudo dpkg -i mysql-apt-config_*_all.deb
    ```
    ou
   ```bash
   ### Installation with apt ###
   sudo apt install ./mysql-apt-config_*_all.deb
   ```
3. Será aberto um prompt solicitando a escolha do produto a ser configurado. Mantive selecionadas as opções:

    - MySQL Server & Cluster
    - mysql-8.0

4. Executa a atualização dos pacotes:
    ```bash 
    sudo apt update
    ```

5. Instala o Workbench:
    ```bash
    sudo apt install mysql-workbench-community
    ```
