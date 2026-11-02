.class public Lcom/szabh/androiddfu/goodix/DfuConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;
    }
.end annotation


# static fields
.field public static final I0iXXO:Ljava/lang/String; = "GoodixDfu"

.field public static final I1XOi1:I = 0xf7

.field public static final O10IXXX0X:Ljava/util/UUID;

.field public static final X0O:Ljava/util/UUID;

.field public static final X1ii:Ljava/util/UUID;

.field public static final XXI:Ljava/util/UUID;


# instance fields
.field public I0IIOi:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public IO:Lcom/goodix/ble/libcomx/transceiver/IFrameSender;

.field public IiI10X:Landroid/content/Context;

.field public O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

.field public OIX0iXi:Lcom/android/mltcode/paycertificationapi/iIIII0XX;

.field public OIi0:Landroid/os/Handler;

.field public OXO1:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public XIi00iiXO:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

.field public XOO0ii0:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;",
            ">;"
        }
    .end annotation
.end field

.field public iO:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "a6ed0401-d344-460a-8075-b9e8ec90d71b"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XXI:Ljava/util/UUID;

    const-string v0, "a6ed0402-d344-460a-8075-b9e8ec90d71b"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->X1ii:Ljava/util/UUID;

    const-string v0, "a6ed0403-d344-460a-8075-b9e8ec90d71b"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O10IXXX0X:Ljava/util/UUID;

    const-string v0, "a6ed0404-d344-460a-8075-b9e8ec90d71b"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->X0O:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/goodix/ble/gr/libdfu/EasyDfu;

    invoke-direct {v0}, Lcom/goodix/ble/gr/libdfu/EasyDfu;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    .line 3
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    .line 4
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0IIOi:Landroidx/lifecycle/MutableLiveData;

    .line 5
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIi0:Landroid/os/Handler;

    .line 6
    new-instance v0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;

    invoke-direct {v0, p0}, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;-><init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO:Lcom/goodix/ble/libcomx/transceiver/IFrameSender;

    .line 7
    new-instance v0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;-><init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/iIIII0XX;

    .line 8
    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IiI10X:Landroid/content/Context;

    .line 9
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    iget-object v1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/iIIII0XX;

    invoke-direct {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/iIIII0XX;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    .line 10
    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO:Lcom/goodix/ble/libcomx/transceiver/IFrameSender;

    invoke-virtual {p1, v0}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->setPduSender(Lcom/goodix/ble/libcomx/transceiver/IFrameSender;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lcom/goodix/ble/gr/libdfu/EasyDfu;

    invoke-direct {v0}, Lcom/goodix/ble/gr/libdfu/EasyDfu;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    .line 13
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    .line 14
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0IIOi:Landroidx/lifecycle/MutableLiveData;

    .line 15
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIi0:Landroid/os/Handler;

    .line 16
    new-instance v0, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;

    invoke-direct {v0, p0}, Lcom/szabh/androiddfu/goodix/DfuConnection$OXO1;-><init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO:Lcom/goodix/ble/libcomx/transceiver/IFrameSender;

    .line 17
    new-instance v0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;-><init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/iIIII0XX;

    .line 18
    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IiI10X:Landroid/content/Context;

    .line 19
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    iget-object v1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/iIIII0XX;

    invoke-direct {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/iIIII0XX;)V

    iput-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    .line 20
    iput-object p2, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    .line 21
    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    iget-object p2, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO:Lcom/goodix/ble/libcomx/transceiver/IFrameSender;

    invoke-virtual {p1, p2}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->setPduSender(Lcom/goodix/ble/libcomx/transceiver/IFrameSender;)V

    return-void
.end method

.method public static synthetic I0IIOi()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->X1ii:Ljava/util/UUID;

    return-object v0
.end method

.method public static synthetic I0iXXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIi0:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic IO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0IIOi:Landroidx/lifecycle/MutableLiveData;

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p0
.end method

.method public static synthetic O00()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XXI:Ljava/util/UUID;

    return-object v0
.end method

.method public static synthetic OIX0iXi(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/goodix/ble/gr/libdfu/EasyDfu;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    return-object p0
.end method

.method public static synthetic OIi0()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O10IXXX0X:Ljava/util/UUID;

    return-object v0
.end method

.method public static synthetic OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/android/mltcode/paycertificationapi/OIO1Xii1;
    .locals 0

    iget-object p0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/szabh/androiddfu/goodix/DfuConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method public static synthetic iO(Lcom/szabh/androiddfu/goodix/DfuConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method


# virtual methods
.method public I1XOi1()V
    .locals 4

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    sget-object v1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->CONNECTING:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    iget-object v1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    const/4 v2, 0x0

    const/16 v3, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;->IO(Landroid/bluetooth/BluetoothDevice;ZI)V

    return-void
.end method

.method public IIX1OXO()V
    .locals 2

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    sget-object v1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->DISCONNECTING:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10:Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;->OIX0iXi()V

    return-void
.end method

.method public O10IXXX0X()Lcom/goodix/ble/gr/libdfu/EasyDfu;
    .locals 1

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00:Lcom/goodix/ble/gr/libdfu/EasyDfu;

    return-object v0
.end method

.method public X0O()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0IIOi:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public X1ii()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public XXI()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public XiOIO(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method
