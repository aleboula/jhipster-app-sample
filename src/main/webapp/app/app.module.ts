import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { JhipsterappsampleSharedModule } from 'app/shared/shared.module';
import { JhipsterappsampleCoreModule } from 'app/core/core.module';
import { JhipsterappsampleAppRoutingModule } from './app-routing.module';
import { JhipsterappsampleHomeModule } from './home/home.module';
import { JhipsterappsampleEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { JhiMainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    JhipsterappsampleSharedModule,
    JhipsterappsampleCoreModule,
    JhipsterappsampleHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    JhipsterappsampleEntityModule,
    JhipsterappsampleAppRoutingModule
  ],
  declarations: [JhiMainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [JhiMainComponent]
})
export class JhipsterappsampleAppModule {}
