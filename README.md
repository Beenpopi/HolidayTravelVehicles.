# 6688084<br>
## Posawee Pirunamornpun

```mermaid
classDiagram
direction RL
    class Customer {
     -customerID : int
     -name : string
     -address : string
     -phone : string
    }

    class Invoice {
     -invoiceID : int
     -date : Date
     -finalPrice : double
     -tax : double
     -licenseFee : double
     -customerSignature : string
     -tradeinAllowance: double
    }

    class Vehicle {
     -serialNumber : string
     -name : string
     -model : string
     -year : int
     -manufacturer : string
     -baseCost : double
    }

    class Salesperson {
     -salespersonID : int
     -name : string
    }

    class TradeInVehicle {
     -serialNumber : string
     -make : string
     -model : string
     -year : int
    }

    class Option {
     -optionCode : string
     -description : string
     -price : double
    }

    %% Relationships with corrected multiplicities
    Customer "1" -- "0..*" Invoice : makes
    Salesperson "1" -- "0..*" Invoice : fills
    Invoice "1" -- "0..1" Vehicle : includes
    Invoice "0..*" -- "0..*" Option : adds
    Invoice "1" -- "0..1" TradeInVehicle : trades
