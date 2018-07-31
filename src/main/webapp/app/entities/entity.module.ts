import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { StationMessageMessageTextModule } from './message-text/message-text.module';
import { StationMessageMessageModule } from './message/message.module';
import { StationMessageMessageCustomerModule } from './message-customer/message-customer.module';
import { StationMessageMessageGroupModule } from './message-group/message-group.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        StationMessageMessageTextModule,
        StationMessageMessageModule,
        StationMessageMessageCustomerModule,
        StationMessageMessageGroupModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class StationMessageEntityModule {}
