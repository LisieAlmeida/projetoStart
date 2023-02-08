import React from "react";
import '../../css/style.css';
import { Link } from 'react-router-dom';
import logoimage from '../../images/capgemini.png';


export default function Login(){
    return (
        <div className="container-scroller">
        <div className="container-fluid page-body-wrapper full-page-wrapper">
            <div className="content-wrapper d-flex align-items-center auth">
            <div className="row flex-grow">
                <div className="col-lg-4 mx-auto">
                <div className="auth-form-light text-left p-5">
                    <div className="brand-logo">
                    <img src={logoimage} alt="Logo sua empresa"/>
                    </div>
                    <h4>Seja bem vindo!</h4>
                    <h6 className="font-weight-light"></h6>
                    <form className="pt-3">
                    <div className="form-group">
                        <input type="email" className="form-control form-control-lg" id="exampleInputEmail1" placeholder="Usuáio"/>
                    </div>
                    <div className="form-group">
                        <input type="password" className="form-control form-control-lg" id="exampleInputPassword1" placeholder="Senha"/>
                    </div>
                    <div className="mt-3">
                        <Link className="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" to="../../home">ENTRAR</Link>
                        
                    </div>
                    <div className="my-2 d-flex justify-content-between align-items-center">
                        <div className="form-check">
                        <label className="form-check-label text-muted">
                            <input type="checkbox" className="form-check-input"/> Mantenha-me conectado </label>
                        </div>
                        <a href="#" className="auth-link text-black">Esqueceu a sua senha?</a>
                    </div>
                    <div className="text-center mt-4 font-weight-light"> Ainda não tem uma conta? <a href="../../users/register" className="text-primary">Contate o suporte</a>
                    </div>
                    </form>
                </div>
                </div>
            </div>
            </div>
        </div>
        </div>
    );

}
