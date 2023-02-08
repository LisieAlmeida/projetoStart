import React from 'react';
import { CircularProgressbar } from 'react-circular-progressbar';
import 'react-circular-progressbar/dist/styles.css';
import {MdAssignmentTurnedIn} from 'react-icons/md';



export default function Cards() {
   
    return (
        <div className="row">
            <div className="col-xl-3 col-lg-6 col-sm-6 grid-margin stretch-card">
            <div className="card">
                <div className="card-body text-center">
                <h5 className="mb-2 text-dark font-weight-normal">Taxa de conversão</h5>
                <h2 className="mb-4 text-dark font-weight-bold">2442</h2>
                <div className="dashboard-progress dashboard-progress-2 d-flex align-items-center justify-content-center item-parent">
                <i className=" absolute-center text-dark">{MdAssignmentTurnedIn}</i>
                <div style={{ width: 125, height: 125 }}>
                    <CircularProgressbar value={66} />
                </div>
                
                </div>
                <p className="mt-4 mb-0">Clientes ativos</p>
                <h3 className="mb-0 font-weight-bold mt-2 text-dark">5443</h3>
                </div>
            </div>
            </div>
            <div className="col-xl-3 col-lg-6 col-sm-6 grid-margin stretch-card">
            <div className="card">
                <div className="card-body text-center">
                <h5 className="mb-2 text-dark font-weight-normal">Vendas</h5>
                <h2 className="mb-4 text-dark font-weight-bold">750.651,00</h2>
                <div className="dashboard-progress dashboard-progress-2 d-flex align-items-center justify-content-center item-parent">
                <i className=" absolute-center text-dark">{MdAssignmentTurnedIn}</i>
                <div style={{ width: 125, height: 125 }}>
                    <CircularProgressbar value={66} />
                </div>
                
                </div>
                <p className="mt-4 mb-0">Incremento desde o mês anterior</p>
                <h3 className="mb-0 font-weight-bold mt-2 text-dark">50%</h3>
                </div>
            </div>
            </div>
            <div className="col-xl-3  col-lg-6 col-sm-6 grid-margin stretch-card">
            <div className="card">
                <div className="card-body text-center">
                <h5 className="mb-2 text-dark font-weight-normal">Meta</h5>
                <h2 className="mb-4 text-dark font-weight-bold">860.000,00</h2>
                <div className="dashboard-progress dashboard-progress-2 d-flex align-items-center justify-content-center item-parent">
                <i className=" absolute-center text-dark">{MdAssignmentTurnedIn}</i>
                <div style={{ width: 125, height: 125 }}>
                    <CircularProgressbar value={80} />
                </div>
                
                </div>
                <p className="mt-4 mb-0">Resultado até o dia anterior</p>
                <h3 className="mb-0 font-weight-bold mt-2 text-dark">80%</h3>
                </div>
            </div>
            </div>
            <div className="col-xl-3 col-lg-6 col-sm-6 grid-margin stretch-card">
            <div className="card">
                <div className="card-body text-center">
                <h5 className="mb-2 text-dark font-weight-normal">Cancelamentos</h5>
                <h2 className="mb-4 text-dark font-weight-bold">3351</h2>
                <div className="dashboard-progress dashboard-progress-2 d-flex align-items-center justify-content-center item-parent">
                <i className=" absolute-center text-dark">{MdAssignmentTurnedIn}</i>
                <div style={{ width: 125, height: 125 }}>
                    <CircularProgressbar value={30} />
                </div>
                
                </div>
                <p className="mt-4 mb-0">Comparativo com o mês anterior</p>
                <h3 className="mb-0 font-weight-bold mt-2 text-dark">25%</h3>
                </div>
            </div>
            </div>
        </div>


    );

}