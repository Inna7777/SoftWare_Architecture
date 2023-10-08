 let name = document.querySelector('#name');
 let login = document.querySelector('#login');
 let password = document.querySelector('#password');
 let submit = document.querySelector('#btn');
 let result = document.querySelector('#result')

 let users = {};

 function User(name, login, password) {
    this. name = name;
    this. login = login;
    this. password = password;
      
 }

 function createId(users){
    return Object.keys(users).length;
 }

 submit.addEventListener('click', () => {
    const nameUser = name.value;
    const loginUser = login.value;
    const passwordUser =password.value;

    const user = new User(nameUser, loginUser, passwordUser)

    const userId = 'User'+ createId(users);
    users[userId]= user;
    if (userId && users[userId] === user) {
        console.log(users);
        name.value = '';
        login.value = '';
        password.value = '';
        result.value = `${nameUser} зарегистрирован!`;
      } else {
        result.value = 'Ошибка регистрации';
      }
   

// Добавляем пользователя в базу данных
const databaseRef = firebase.database().ref('users/' + userId);
databaseRef.set(user);

});
   
    // result.value = 'Вы зарегистрировались';
 


  
  
 

 