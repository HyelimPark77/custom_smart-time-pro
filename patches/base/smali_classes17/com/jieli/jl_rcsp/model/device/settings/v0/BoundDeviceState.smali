.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATE_CONNECTED:I = 0x1

.field public static final STATE_CONNECTING:I = 0x2

.field public static final STATE_DISCONNECTED:I = 0x0

.field public static final STATE_UNCONNECTABLE:I = 0xff

.field public static final TYPE_CHARGING_CASE:I = 0x2

.field public static final TYPE_TWS_HEADSET:I = 0x1


# instance fields
.field private state:Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;)V
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 2
    new-array p2, v0, [B

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;->toData()[B

    move-result-object p2

    :goto_0
    const/4 v1, 0x3

    invoke-direct {p0, v1, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(III[B)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(Landroid/os/Parcel;)V

    .line 4
    const-class v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;->state:Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getState()Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;->state:Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    return-object v0
.end method

.method public parse([B)I
    .locals 2

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->parse([B)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getPayload()[B

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_1

    :goto_0
    return p1

    :cond_1
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;->state:Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    return p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;->state:Lcom/jieli/jl_rcsp/model/device/settings/v0/DeviceState;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
