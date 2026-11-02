.class public Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_MTU_MAX:I = 0x1fd

.field public static final BLE_MTU_MIN:I = 0x14

.field public static final CONNECT_TIMEOUT:I = 0x9c40

.field public static final DEFAULT_SCAN_TIMEOUT:I = 0x1f40

.field public static final DEFAULT_SEND_CMD_TIMEOUT:I = 0xbb8

.field public static final FLAG_LOADER:I = 0x1

.field public static final FLAG_SDK:I = 0x0

.field public static IS_CALLBACK_IN_MAIN:Z = false

.field public static IS_LOG_BLE_SEND:Z = false

.field public static final JL_AUTH:Ljava/lang/String; = "jl_ota_auth"

.field public static final PHY_LE_1M_MASK:I = 0x1

.field public static final PHY_LE_2M_MASK:I = 0x2

.field public static final PHY_LE_CODED_MASK:I = 0x4

.field public static final PROTOCOL_TYPE_BLE:I = 0x0

.field public static final PROTOCOL_TYPE_GATT_OVER_BR_EDR:I = 0x2

.field public static final PROTOCOL_TYPE_SPP:I = 0x1

.field public static final RECEIVE_OTA_CMD_TIMEOUT:I = 0x4e20

.field public static final SCAN_TYPE_ALL:I = 0x2

.field public static final SCAN_TYPE_BLE:I = 0x0

.field public static final SCAN_TYPE_CLASSIC:I = 0x1

.field public static final SEND_DATA_MAX_TIMEOUT:I = 0x1770

.field public static final TRANSPORT_AUTO:I = 0x0

.field public static final TRANSPORT_BREDR:I = 0x1

.field public static final TRANSPORT_LE:I = 0x2

.field public static final UUID_A2DP:Ljava/util/UUID;

.field public static final UUID_CLIENT_CHARACTERISTIC_CONFIG:Ljava/util/UUID;

.field public static final UUID_HFP:Ljava/util/UUID;

.field public static final UUID_NOTIFICATION:Ljava/util/UUID;

.field public static final UUID_SERVICE:Ljava/util/UUID;

.field public static final UUID_SPP:Ljava/util/UUID;

.field public static final UUID_WRITE:Ljava/util/UUID;

.field public static final WRITE_TYPE_NONE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0000ae00-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_SERVICE:Ljava/util/UUID;

    const-string v0, "0000ae01-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_WRITE:Ljava/util/UUID;

    const-string v0, "0000ae02-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_NOTIFICATION:Ljava/util/UUID;

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_CLIENT_CHARACTERISTIC_CONFIG:Ljava/util/UUID;

    const-string v0, "0000111e-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_HFP:Ljava/util/UUID;

    const-string v0, "0000110b-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_A2DP:Ljava/util/UUID;

    const-string v0, "00001101-0000-1000-8000-00805F9B34FB"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_SPP:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static printProtocolType(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN_PROTOCOL_TYPE : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "PROTOCOL_TYPE_GATT_OVER_BR_EDR(2)"

    return-object p0

    :cond_1
    const-string p0, "PROTOCOL_TYPE_SPP(1)"

    return-object p0

    :cond_2
    const-string p0, "PROTOCOL_TYPE_BLE(0)"

    return-object p0
.end method
