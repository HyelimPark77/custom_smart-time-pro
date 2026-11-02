.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public final a:Landroid/bluetooth/BluetoothDevice;

.field public final b:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

.field public c:[B

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)[B
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->c:[B

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->a:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method


# virtual methods
.method public getCallback()Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b:Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->a:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getOtaData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->c:[B

    return-object v0
.end method

.method public isNetworkOTA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->d:Z

    return v0
.end method

.method public setNetworkOTA(Z)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->d:Z

    return-object p0
.end method

.method public setOtaData([B)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->c:[B

    return-object p0
.end method
