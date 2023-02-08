import React from 'react';
import Cards from '../Cards';


export default function Daschboard() {
    return(
        <div className="content-wrapper">
            <div className="content-wrapper">
                <div className="d-xl-flex justify-content-between align-items-start">
                <h2 className="text-secondary font-weight-bold mb-2"> Visão geral </h2>
                <div className="d-sm-flex justify-content-xl-between align-items-center mb-2">
                    <div className="btn-group bg-white p-3" role="group" aria-label="Basic example">
                    <button type="button" className="btn btn-link text-gray py-0 border-right">7 Dias</button>
                    <button type="button" className="btn btn-link text-dark py-0 border-right">1 Mês</button>
                    <button type="button" className="btn btn-link text-gray py-0">3 Meses</button>
                    </div>
                    <div className="dropdown ms-0 ml-md-4 mt-2 mt-lg-0">
                    <button className="btn bg-white dropdown-toggle p-3 d-flex align-items-center" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i className="mdi mdi-calendar me-1"></i>01 Fev 2023 - 01 Fev 2023 </button>
                    <div className="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton1">
                        <h6 className="text-dark dropdown-header">Filtros</h6>
                        <a className="dropdown-item" href="#">Mês atual</a>
                        <a className="dropdown-item" href="#">Mês anterior</a>
                        <a className="dropdown-item" href="#">Personalizado</a>
                        <div className="dropdown-divider"></div>
                        <a className="dropdown-item" href="#">Vendedores</a>
                    </div>
                    </div>
                </div>
                </div>
            </div>
            <div className="row">
                <div className="col-md-12">
                    <div className="d-sm-flex justify-content-between align-items-center transaparent-tab-border {">
                    <ul className="nav nav-tabs tab-transparent" role="tablist">
                        <li className="nav-item">
                        <a className="nav-link" id="home-tab" data-bs-toggle="tab" href="#" role="tab" aria-selected="true">Produtos</a>
                        </li>
                        <li className="nav-item">
                        <a className="nav-link" id="business-tab" data-bs-toggle="tab" href="#business-1" role="tab" aria-selected="false">Vendas</a>
                        </li>
                        <li className="nav-item">
                        <a className="nav-link active" id="performance-tab" data-bs-toggle="tab" href="#" role="tab" aria-selected="false">Performance</a>
                        </li>
                    </ul>
                    <div className="d-md-block d-none">
                        <a href="#" className="text-light p-1"><i className="mdi mdi-view-dashboard"></i></a>
                        <a href="#" className="text-light p-1"><i className="mdi mdi-dots-vertical"></i></a>
                    </div>
                    </div>
                    <div className="tab-content tab-transparent-content">
                    <div className="tab-pane fade show active" id="business-1" role="tabpanel" aria-labelledby="business-tab"></div>
                        <Cards/>
                    </div>
                </div>
            </div>


        </div>
    );

}