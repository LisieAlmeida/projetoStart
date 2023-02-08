import React from "react";
import Daschboard from "../../../components/Dashboard";
import Header from "../../../components/Header";
import Sidebar from "../../../components/Sidebar";

export default function Home() {
    return (
        <div className="container-scroller">
        <Header/>
        <div className="container-fluid page-body-wrapper">
        <Sidebar/>
        <div className="main-panel">
            <Daschboard/>
        
        </div>
        </div>
        </div>
    );

}