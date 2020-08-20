Cara install VS Code di Linux Ubuntu
1.Masuk ke Terminal, masuk ke Super User 
sudo su
2. Perbarui indeks paket perbarui indeks paket dan instal dependensi
sudo apt update
sudo apt install software-properties-common apt-transport-https wgete
3. Impor Microsoft GPG key menggunakan perintah wget berikut:
wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
4. Aktifkan repositori Visual Studio Code dengan mengetik
sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
5. instal versi terbaru dari Visual Studio Code
sudo apt update
sudo apt install code