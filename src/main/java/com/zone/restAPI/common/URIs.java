package com.zone.restAPI.common;

public class URIs {

    public static final String LOGIN = "login";
    public static final String GET_PURCHASE_ORDER_DETAILS = "details?opco={opco}&userName=OPS${userName}&maxResults=50&startIndex=0";
    public static final String GET_PURCHASE_ORDER_DETAILS_BY_NUMBER = "details?opco={opco}&userName=OPS${userName}&maxResults=50&startIndex=0&poNumber={poNumber}";
    public static final String UPDATE_DOOR_NUMBER = "door-no-update";
    public static final String UPDATE_PURCHASE_ORDER_STATUS_NUMBER ="open-po-status";
    public static final String GET_PURCHASE_ORDER_DETAILS_CHECKIN = "information?recId={poNumber}&opCo={opco}";
    public static final String UPDATE_PURCHASE_ORDER_DATA_COLLECTION = "update-data-collect";
    public static final String UPDATE_PURCHASE_ORDER_RECEIVING_QUANTITY = "update-quantity";
    public static final String UPDATE_PURCHASE_ORDER_DEMAND_PALLET_UPDATE = "demand-pallet-update";
    public static final String UPDATE_PURCHASE_ORDER_ASSIGN_PUT_LOCATION = "assign-put-loc";
    public static final String UPDATE_PURCHASE_ORDER_CLOSE_PO = "close-po";
    public static final String UPDATE_PURCHASE_ORDER_PUT_LOCATION = "update-put-loc";
    public static final String RELEASE_PURCHASE_ORDER= "release";
    public static final String GET_FOOD_SAFETY_DETAILS = "food-safety-overview?opCo={opco}&frontTemp={number}&midTemp=&maxResult=50&startIndex=0&username=OPS${userName}";
    public static final String GET_COLLECTION_DATA_DETAILS = "data-collect-details?ermId={poNumber}&opCo={opco}&cpv=-&palletId={palletId}&prodId={prodID}&userId=OPS${userName}";
    public static final String GET_PALLET_TYPE_DETAILS = "misc/palletTypes?maxResult=50&opCoNumber={opco}&startIndex=0&userName=OPS${userName}";
    public static final String UPDATE_PALLET_TYPE_EXT_CUBE = "misc/update-palletTypes?dmd3PartMove=N&dmdRepl=Y&extCaseCube={value}&fullPallet=N&ndmRepl=N&ndmReplMethod=T&opCoNumber={opco}&palletType={palletType}&partialPallet=N&putAwayQtyForFloatingItem=N&putAwayQtyForHomeSlot=Y&userName=OPS${userName}";
    public static final String GET_SYSPAR_DETAILS = "list?maxResult=50&opco={opco}&description={description}&startIndex=0&username=OPS${userName}";
    public static final String GET_TRANSACTION_DETAILS = "Transactions?opco={opco}&snOrPoNum={poNumber}&transType={type}&startIndex=0&maxResults=50";
    public static final String UPDATE_SYSPAR_VALUE = "edit?opco={opco}&username=OPS${userName}&superUserFlg=N";
    public static final String GET_TRANSACTION_DETAILS_ROUTE_NO = "Transactions?opco={opco}&transType={type}&routeNum={routeNumber}&startIndex=0&maxResults=50";
    public static final String CONFIRM_PURCHASE_ORDER = "putaway-delete";
    public static final String GET_WAREHOUSE_MAINTENANCE_VIEW = "list-warehouse-id?opco={opco}&userId={userName}";
    public static final String GENERATE_CYCLE_COUNT = "generate-inventory-cycle";
    public static final String GET_GENERATED_CYCLE_COUNTS = "inventorycyclecount?miniload=N&zoneId={zoneID}&unGroupedOnly=&homeSlotsOnly=N&reCountTasksOnly=N&status=PRE&opco={opco}&username=OPS${userName}&maxResult=10&startIndex=0";
    public static final String POST_COMMIT_CYCLE_COUNT = "commit-inventory-cycle";
    public static final String POST_CLEAR_CYCLE_COUNT = "clear-all-inventory-cycle";
    public static final String CYCLE_COUNT_PRINT = "printAll";
    public static final String GET_CYCLE_COUNT_ADJUST_DETAILS = "fetch-cycle-count-data?itemNo={prodId}&opco={opco}&userId=OPS${userName}";
    public static final String GET_CYCLE_COUNT_INVENTORY_DETAILS = "get-inventory-cycle?opco={opco}&username=OPS${userName}&groupNo={groupNo}&prodId={prodId}&cpv=-&logiLoc={logiLoc}&maxResult=10&startIndex=0";
    public static final String UPDATE_INVENTORY_CYCLE_COUNT = "edit-inventory-cycle";
    public static final String ADJUST_CYCLE_COUNT = "adjust";
    public static final String GET_ADC_TRANSACTION_DETAILS = "Transactions?opco={opco}&transType={type}&prodId={prodId}&startIndex=0&maxResults=50";
    public static final String POST_GENERATE_NON_DEMAND_REPLENISHMENT_TASK = "generateRepl";
    public static final String GET_NON_DEMAND_REPLENISHMENT_TASK_DETAILS = "inventory?area={area}&status=PRE&startIndex=0&opco={opco}&userId=OPS${userName}&maxResult=50";
    public static final String POST_NON_DEMAND_REPLENISHMENT_TASK_COMMIT = "commit";
    public static final String POST_NON_DEMAND_REPLENISHMENT_TASK_DELETE = "delete-all";
    public static final String UPDATE_PALLET_TYPE_HOME_SLOT = "misc/update-palletTypes?dmd3PartMove=N&dmdRepl=Y&extCaseCube={exValue}&fullPallet=N&ndmRepl=N&ndmReplMethod=T&opCoNumber={opco}&palletType={palletType}&partialPallet=N&putAwayQtyForFloatingItem=N&putAwayQtyForHomeSlot={homeValue}&userName=OPS${userName}";
    public static final String ADJUST_QUANTITY = "adjust-quantity?opco={opco}&userName={userName}&operation=U";
    public static final String ONE_SIDE_ADJUST_QUANTITY = "update-inventory-oneside";
    public static final String GET_LOGICAL_LOCATION_DETAILS = "/location/logical-overview?maxResult=50&opCo={opco}&startIndex=0&userName=OPS${userName}";
    public static final String UPDATE_SAFE_FOOD_DETAILS = "food-safety-insert?userName=OPS${userName}";

    public static final String ROUTE_GENERATION = "route-generation";
    public static final String SOS_BATCH = "sos-batch";
    public static final String ROUTE_STOP = "route-stop";
    public static final String GENERATION = "generation";
    public static final String ROUTE_CLOSE = "truck-close?";
    public static final String UPDATE_CATCH_WEIGHT = "update-catch-weight";
    public static final String WAREHOUSE_USER_DETAIL = "warehouse-user-detail";
    public static final String WAREHOUSE_USER_JOB_Summery = "warehouse-user-summary-job";
    public static final String WAREHOUSE_USER_SUMMERY = "warehouse-user-summary";
    public static final String EDIT_ITEM_DETAILS = "edit-item-details";



    public static final String SUMMERY_BY_JOB = "summary-by-job";
    public static final String BRIEF_SUMMERY = "brief-summary-brief-summary";
    public static final String BRIEF_SUMMERY_INDIVIDUAL = "brief-summary-individual";



    public static final String GET_ROUTE_DETAILS_BY_ROUTE_NUMBER = "overview?opco={opco}&routeNumber={routeNumber}&userId=OPS${userName}&startIndex=0&maxResults=50";
    public static final String GET_ALL_MANIFEST_OVERVIEW_DETAILS = "manifest-overview?opco={opco}&maxResult=100&startIndex=0&userId=OPS${userName}";
    public static final String GET_SPECIFIC_MANIFEST_OVERVIEW_DETAILS = "manifest-details?manifestNo={manifestNumber}&opCo={opco}&userName=OPS${userName}&startIndex=0&maxResult=50";
    public static final String GET_TRANSACTION_DETAILS_PROD_ID = "Transactions?opco={opco}&transType={type}&prodId={prodId}&startIndex=0&maxResults=50";


    public static final String GET_ROUTE_DETAILS_BY_ORDER_TYPE_STATUS = "overview?opco={opco}&orderType={orderType}&selectionMethod={selectionMethod}&status={status}&userId=OPS${userName}&startIndex=0&maxResults=50";
    public static final String POST_SYSPAR_APP_FUNCTION = "edit?opco={opco}&username=OPS${username}&superUserFlg={superUserFlg}";
    public static final String POST_ROUTE_CLOSE = "truck-close?userName=OPS${username}";
    public static final String POST_MANIFEST_CLOSE = "update-manifest-status";
    public static final String POST_CURRENT_RETURN_CLOSE = "insert-returns?userName=OPS${username}";
    public static final String POST_WAREHOUSE_USER_DETAIL = "insert-returns?userName=OPS${username}";


    public static final String GET_PICKADJ_ROUTE_DETAILS_BY_ROUTE_NUMBER = "pick-adjustment?opco={opco}&routeNumber={routeNumber}&userId=OPS${userId}&startIndex=0&maxResults=50";
    public static final String GET_PICKADJ_CATCH_WEIGHT_DETAILS_BY_ROUTE_NUMBER = "pick-adj-cw?opCo={opco}&userName=OPS${userName}&routeNo={routeNumber}&startIndex=0&maxResult=50";
    public static final String GET_CATCH_WEIGHT_DETAILS = "catchweight?opco={opco}&userId=OPS${userName}&orderLineId={orderLineId}&orderId={orderId}";
    public static final String GET_STOPS_ROUTE_DETAILS_BY_ROUTE_NUMBER = "view-stop-details?routeNo={routeNo}&opco={opco}&userId=OPS${userId}";
    public static final String GET_BATCH_NUMBER_STARTING_WITH_L_LABOR_REPORT_HISTORY = "report-history/labor-report-history-detail?batchNumber=l&maxResult=10&startIndex=0&type=BN&opCo={opCo}&userId=OPS${userId}";
    public static final String GET_ITEM_DETAILS_BY_ITEM_NUMBER= "details?opCo={opCo}&userId={userId}&startIndex=0&maxResult=50&item={item}";
}
