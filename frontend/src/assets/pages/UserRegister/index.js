import React, {useState} from 'react';
import { useHistory, Link } from 'react-router-dom';
import FormUser from '../../../components/Forms/FormUser';
import Header from '../../../components/Header';
import Sidebar from '../../../components/Sidebar';

import api from '../../../services/api';

export default function UserRegister() {

    

    return(
        <div class="container-scroller">
        <Header/>
        <div class="container-fluid page-body-wrapper">
        <Sidebar/>
        <div class="main-panel">
            <FormUser/>
        </div>
        </div>
        </div>
    );
}