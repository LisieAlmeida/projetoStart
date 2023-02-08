import React from "react";

import '../../assets/css/style.css'
import logoimage from '../../assets/images/capgemini.png'
import logoimagemini from '../../assets/images/cap.svg'
import face from '../../assets/images/faces/face1.jpg'
import {MdMailOutline, MdNotificationsNone} from 'react-icons/md'


import { Link } from "react-router-dom";


export default function Header() {
    

    return (
        <nav className="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
        <div className="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <Link className="navbar-brand brand-logo" to="/home"><img src={logoimage} alt="logo" /></Link>
          <Link className="navbar-brand brand-logo-mini" to="/home"><img src={logoimagemini} alt="logo" /></Link>
        </div>
        <div className="navbar-menu-wrapper d-flex align-items-stretch">
          {/*<button className="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span className="mdi mdi-menu"><AiFillAlert/></span>
            </button>*/}
          <div className="search-field d-none d-xl-block">
            <form className="d-flex align-items-center h-100" action="#">
              <div className="input-group">
                <div className="input-group-prepend bg-transparent">
                  <i className="input-group-text border-0 mdi mdi-magnify"></i>
                </div>
                <input type="text" className="form-control bg-transparent border-0" placeholder="Buscar produtos"/>
              </div>
            </form>
          </div>
          <ul className="navbar-nav navbar-nav-right">
            <li className="nav-item nav-profile dropdown">
              <a className="nav-link dropdown-toggle" id="profileDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                <div className="nav-profile-img">
                  <img src={face} alt="image"/>
                </div>
                <div className="nav-profile-text">
                  <p className="mb-1 text-black">José Silva</p>
                </div>
              </a>
              <div className="dropdown-menu navbar-dropdown dropdown-menu-right p-0 border-0 font-size-sm" aria-labelledby="profileDropdown" data-x-placement="bottom-end">
                <div className="p-3 text-center bg-cap">
                  <img className="img-avatar img-avatar48 img-avatar-thumb" src="assets/images/faces/face1.jpg" alt=""/>
                </div>
                <div className="p-2">
                  <h5 className="dropdown-header text-uppercase ps-2 text-dark">José Silva</h5>
                  <a className="dropdown-item py-1 d-flex align-items-center justify-content-between" href="#">
                    <span>E-mail</span>
                    <span className="p-0">
                      <span className="badge badge-primary">3</span>
                      <i className="mdi mdi-email-open-outline ms-1"></i>
                    </span>
                  </a>
                  <a className="dropdown-item py-1 d-flex align-items-center justify-content-between" href="#">
                    <span>Perfil</span>
                    <span className="p-0">
                      <span className="badge badge-success">1</span>
                      <i className="mdi mdi-account-outline ms-1"></i>
                    </span>
                  </a>
                  <a className="dropdown-item py-1 d-flex align-items-center justify-content-between" href="javascript:void(0)">
                    <span>Configurações</span>
                    <i className="mdi mdi-settings"></i>
                  </a>
                  <div role="separator" className="dropdown-divider"></div>
                  <a className="dropdown-item py-1 d-flex align-items-center justify-content-between" href="#">
                    <span>Sair</span>
                    <i className="mdi mdi-logout ms-1"></i>
                  </a>
                </div>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                <i><MdMailOutline/></i>
                <span className="count-symbol bg-success"></span>
              </a>
              <div className="dropdown-menu dropdown-menu-end navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                <h6 className="p-3 mb-0 bg-cap text-white py-4">Mensagens</h6>
                <div className="dropdown-divider"></div>
                <a className="dropdown-item preview-item">
                  <div className="preview-thumbnail">
                    <img src="assets/images/faces/face4.jpg" alt="image" className="profile-pic"/>
                  </div>
                  <div className="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 className="preview-subject ellipsis mb-1 font-weight-normal">André enviou uma mensagem para você</h6>
                    <p className="text-gray mb-0"> 1 Minuto atrás </p>
                  </div>
                </a>
                <div className="dropdown-divider"></div>
                <a className="dropdown-item preview-item">
                  <div className="preview-thumbnail">
                    <img src="assets/images/faces/face2.jpg" alt="image" className="profile-pic"/>
                  </div>
                  <div className="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 className="preview-subject ellipsis mb-1 font-weight-normal">Cleópatra enviou uma mensagem para você</h6>
                    <p className="text-gray mb-0"> 15 Minutos atrás </p>
                  </div>
                </a>
                <div className="dropdown-divider"></div>
                <a className="dropdown-item preview-item">
                  <div className="preview-thumbnail">
                    <img src="assets/images/faces/face1.jpg" alt="image" className="profile-pic"/>
                  </div>
                  <div className="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 className="preview-subject ellipsis mb-1 font-weight-normal">Nova foto de perfil cadastrada</h6>
                    <p className="text-gray mb-0"> 18 Minutos atrás </p>
                  </div>
                </a>
                <div className="dropdown-divider"></div>
                <h6 className="p-3 mb-0 text-center">3 novas mensagens</h6>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#" data-bs-toggle="dropdown">
                <i><MdNotificationsNone/></i>
                <span className="count-symbol bg-danger"></span>
              </a>
              <div className="dropdown-menu dropdown-menu-end navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                <h6 className="p-3 mb-0 bg-primary text-white py-4">Notificações</h6>
                <div className="dropdown-divider"></div>
                <a className="dropdown-item preview-item">
                  <div className="preview-thumbnail">
                    <div className="preview-icon bg-success">
                      <i className="mdi mdi-calendar"></i>
                    </div>
                  </div>
                  <div className="preview-item-content d-flex align-items-start flex-column justify-content-center">
                    <h6 className="preview-subject font-weight-normal mb-1">Eventos hoje</h6>
                    <p className="text-gray ellipsis mb-0"> Você possui eventos para esta data</p>
                  </div>
                </a>
                <div className="dropdown-divider"></div>
                <h6 className="p-3 mb-0 text-center">Veja todas as notificações</h6>
              </div>
            </li>
          </ul>
          <button className="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
            <span className="mdi mdi-menu"></span>
          </button>
        </div>
      </nav>
    );
}