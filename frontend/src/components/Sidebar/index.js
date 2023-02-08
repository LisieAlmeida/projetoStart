import React from "react";
import {MdAccountBox, MdOutlineFileCopy, MdOutlineSettingsSuggest} from 'react-icons/md';
import {MdArrowRightAlt} from 'react-icons/md';
import {MdDashboard} from 'react-icons/md';
import {MdGroups} from 'react-icons/md';
import {MdShopTwo} from 'react-icons/md';
import {MdAssignmentTurnedIn} from 'react-icons/md';
import { Link } from "react-router-dom";

export default function Sidebar() {
    return(
        <nav className="sidebar sidebar-offcanvas" id="sidebar">
            <ul className="nav">
                <li className="nav-item">
                    <Link className="nav-link" to="/home">
                        <span className="icon-bg"><i className="menu-icon"><MdDashboard/></i></span>
                        <span className="menu-title">Dashboard</span>
                    </Link>
                </li>
                <li className="nav-item">
                    <a className="nav-link" data-bs-toggle="collapse" href="#clientes" aria-expanded="false" aria-controls="clientes">
                        <span className="icon-bg"><i className="menu-icon"><MdAccountBox/></i></span>
                        <span className="menu-title">Clientes</span>
                        <i className="menu-arrow"><MdArrowRightAlt/></i>
                    </a>
                    <div className="collapse" id="clientes">
                        <ul className="nav flex-column sub-menu">
                            <li className="nav-item"> <a className="nav-link" href="">Cadastrar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Editar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Listar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Localizar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Consultar</a></li>
                        </ul>
                    </div>
                </li>
                <li className="nav-item">
                    <a className="nav-link" data-bs-toggle="collapse" href="#clientes" aria-expanded="false" aria-controls="ui-basic">
                        <span className="icon-bg"><i className="menu-icon"><MdGroups/></i></span>
                        <span className="menu-title">Fornecedores</span>
                        <i className="menu-arrow"><MdArrowRightAlt/></i>
                    </a>
                    <div className="collapse" id="clientes">
                        <ul className="nav flex-column sub-menu">
                            <li className="nav-item"> <a className="nav-link" href="">Cadastrar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Editar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Listar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Localizar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Consultar</a></li>
                        </ul>
                    </div>
                </li>
                <li className="nav-item">
                    <a className="nav-link" data-bs-toggle="collapse" href="#produtos" aria-expanded="false" aria-controls="ui-basic">
                        <span className="icon-bg"><i className="menu-icon"><MdShopTwo/></i></span>
                        <span className="menu-title">Produtos</span>
                        <i className="menu-arrow"><MdArrowRightAlt/></i>
                    </a>
                    <div className="collapse" id="produtos">
                        <ul className="nav flex-column sub-menu">
                            <li className="nav-item"> <a className="nav-link" href="">Cadastrar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Editar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Listar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Localizar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Consultar</a></li>
                        </ul>
                    </div>
                </li>
                <li className="nav-item">
                    <a className="nav-link" data-bs-toggle="collapse" href="#vendas" aria-expanded="false" aria-controls="ui-basic">
                        <span className="icon-bg"><i className="menu-icon"><MdAssignmentTurnedIn/></i></span>
                        <span className="menu-title">Vendas</span>
                        <i className="menu-arrow"><MdArrowRightAlt/></i>
                    </a>
                    <div className="collapse" id="vendas">
                        <ul className="nav flex-column sub-menu">
                            <li className="nav-item"> <a className="nav-link" href="">Cadastrar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Editar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Listar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Localizar</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Consultar</a></li>
                        </ul>
                    </div>
                </li>
                <li className="nav-item">
                    <Link className="nav-link" to="/home">
                        <span className="icon-bg"><i className="menu-icon"><MdOutlineFileCopy/></i></span>
                        <span className="menu-title">Relatórios</span>
                    </Link>
                </li>
                <li className="nav-item">
                    <a className="nav-link" data-bs-toggle="collapse" href="#configuracoes" aria-expanded="false" aria-controls="ui-basic">
                        <span className="icon-bg"><i className="menu-icon"><MdOutlineSettingsSuggest/></i></span>
                        <span className="menu-title">Configurações</span>
                        <i className="menu-arrow"><MdArrowRightAlt/></i>
                    </a>
                    <div className="collapse" id="configuracoes">
                        <ul className="nav flex-column sub-menu">
                            <li className="nav-item"> <Link className="nav-link" to="../../users/register">Usuários</Link></li>
                            <li className="nav-item"> <a className="nav-link" href="">Vendedores</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Metas</a></li>
                            <li className="nav-item"> <a className="nav-link" href="">Tipos de pagamento</a></li>
                        </ul>
                    </div>
                </li>
          </ul>
        </nav>
    );
}