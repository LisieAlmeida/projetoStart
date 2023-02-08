import React from 'react';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Home from './assets/pages/Home';
import Login from './assets/pages/Login';
import UserRegister from './assets/pages/UserRegister';

export default function AppRoutes() {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" exact element={<Login/>}/>
                <Route path="/home" exact element={<Home/>}/>
                <Route path="/users/register" exact element={<UserRegister/>}/>
                
            </Routes>
        </BrowserRouter>
    );
}