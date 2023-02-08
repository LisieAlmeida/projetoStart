import React, {useState} from 'react';
import { useNavigate } from 'react-router-dom/dist';



import api from '../../../services/api';


export default function FormUser() {

    const[id, setId] = useState(null);
    const[name, setName] = useState('');
    const[email, setEmail] = useState('');
    const[password, setPassword] = useState('');
    const[dataCriacao, setDataCriacao] = useState('null');
    const[dataAlteracao, setDataAlteracao] = useState('null');

    const navigate = useNavigate;

    async function createNewUser(e){
        e.preventDefault();

        const data = {
            name,
            email,
            password,
        }

        try {
            await api.post('api/users', data);
            navigate('/home');
            
            
        } catch (error) {
            alert('Erro');
        }
    }


    return(
        <div className="content-wrapper">
            <div className="row">  
              <div className="col-12 grid-margin stretch-card">
                <div className="card">
                  <div className="card-body">
                    <h4 className="card-title">Novo Usuário</h4>
                    <form className="forms-sample" id="formUser" onSubmit={createNewUser}>
                      <div className="form-group">
                        <label for="exampleInputName1" id="name">Nome</label>
                        <input type="text" className="form-control" id="exampleInputName1" placeholder="Nome" value={name} onChange={e =>setName(e.target.value)} />
                      </div>
                      <div className="form-group">
                        <label for="exampleInputEmail3" id="email">Email</label>
                        <input type="email" className="form-control" id="exampleInputEmail3" placeholder="Email" value={email} onChange={e =>setEmail(e.target.value)}/>
                      </div>
                      <div className="form-group">
                        <label for="exampleInputPassword4" id="password">Senha</label>
                        <input type="password" className="form-control" id="exampleInputPassword4" placeholder="Password" value={password} onChange={e =>setPassword(e.target.value)}/>
                      </div>
                      <button type="submit" id="buttonUser" className="btn btn-primary me-2">Cadastrar</button>
                      <button className="btn btn-light">Cancelar</button>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
          

    );
}