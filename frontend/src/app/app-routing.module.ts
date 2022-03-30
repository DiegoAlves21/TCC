import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './private/pages/dashboard/dashboard.component';
import { TablesComponent } from './private/pages/tables/tables.component';
import { FormsComponent } from './private/pages/forms/forms.component';
import { TypographyComponent } from './private/pages/typography/typography.component';
import { MapsComponent } from './private/pages/maps/maps.component';
import { NotificationsComponent } from './private/pages/notifications/notifications.component';
import { PublicComponent } from './public/public.component';
import { PrivateComponent } from './private/private.component';
import { LoginComponent } from './public/login/login.component';
import { ProfissionalSaudeComponent } from './private/pages/profissional-saude/profissional-saude.component';
import { CadastroProfissionalComponent } from './private/pages/profissional-saude/cadastro-profissional/cadastro-profissional.component';
import { PrestadorComponent } from './private/pages/prestador/prestador.component';
import { CadastroPrestadorComponent } from './private/pages/prestador/cadastro-prestador/cadastro-prestador.component';
import { ConsultaComponent } from './private/pages/consulta/consulta.component';
import { CadastrarConsultaComponent } from './private/pages/consulta/cadastrar-consulta/cadastrar-consulta.component';

const routes: Routes = [
  /*{path: '',   redirectTo: '/dashboard', pathMatch: 'full'},
  {path: 'dashboard', component: DashboardComponent},
  {path: 'forms', component: FormsComponent},
  {path: 'tables', component: TablesComponent},
  {path: 'typography', component: TypographyComponent},
  {path: 'maps', component: MapsComponent},
  {path: 'notifications', component: NotificationsComponent},*/
  {path: 'login', component: LoginComponent},
  {
    path: '',
    component: PrivateComponent,
    children: [
      {
        path: 'dashboard',
        data: { title: 'Dashboard'},
        component: DashboardComponent
      },
      {
        path: 'profissionalSaude',
        data: { title: 'Profissinais de Saúde'},
        component: ProfissionalSaudeComponent
      },
      {
        path: 'cadastrar-profissional',
        data: { title: 'Cadastrar Profissional'},
        component: CadastroProfissionalComponent
      },
      {
        path: 'prestador',
        data: { title: 'Prestador de Serviço'},
        component: PrestadorComponent
      },
      {
        path: 'cadastrar-prestador',
        data: { title: 'Cadastrar Prestador'},
        component: CadastroPrestadorComponent
      },
      {
        path: 'consulta',
        data: { title: 'Consulta'},
        component: ConsultaComponent
      },
      {
        path: 'cadastrar-consulta',
        data: { title: 'Cadastrar Consulta'},
        component: CadastrarConsultaComponent
      },
      {
        path: 'forms',
        data: { title: 'Forms'},
        component: FormsComponent
      },
      {
        path: 'tables',
        data: { title: 'Tables'},
        component: TablesComponent
      },
      {
        path: 'typography',
        data: { title: 'Typography'},
        component: TypographyComponent
      },
      {
        path: 'maps',
        data: { title: 'Maps'},
        component: MapsComponent
      },
      {
        path: 'notifications',
        data: { title: 'NotificationsComponent'},
        component: NotificationsComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
