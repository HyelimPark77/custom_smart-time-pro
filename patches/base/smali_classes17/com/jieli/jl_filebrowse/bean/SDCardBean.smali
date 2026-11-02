.class public Lcom/jieli/jl_filebrowse/bean/SDCardBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLASH:I = 0x2

.field public static final FLASH_2:I = 0x4

.field public static final INDEX_FLASH:I = 0x3

.field public static final INDEX_FLASH2:I = 0x5

.field public static final INDEX_FLASH3:I = 0x6

.field public static final INDEX_LINE_IN:I = 0x4

.field public static final INDEX_SD0:I = 0x1

.field public static final INDEX_SD1:I = 0x2

.field public static final INDEX_USB:I = 0x0

.field public static final LINEIN:I = 0x3

.field public static final SD:I = 0x0

.field public static final USB:I = 0x1


# instance fields
.field private devHandler:I

.field private device:Landroid/bluetooth/BluetoothDevice;

.field private index:I

.field private name:Ljava/lang/String;

.field private online:Z

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_filebrowse/bean/SDCardBean$1;

    invoke-direct {v0}, Lcom/jieli/jl_filebrowse/bean/SDCardBean$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->type:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->name:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->online:Z

    .line 10
    const-class v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method public static getStorageType(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, -0x1

    return p0

    :pswitch_0
    const/4 p0, 0x4

    return p0

    :pswitch_1
    const/4 p0, 0x3

    return p0

    :pswitch_2
    const/4 p0, 0x2

    return p0

    :pswitch_3
    const/4 p0, 0x0

    return p0

    :pswitch_4
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    iget v3, p1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    iget v3, p1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    iget-object p1, p1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getDevHandler()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    return v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isOnline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->online:Z

    return v0
.end method

.method public setDevHandler(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    return-object p0
.end method

.method public setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public setIndex(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->name:Ljava/lang/String;

    return-object p0
.end method

.method public setOnline(Z)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->online:Z

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->type:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SDCardBean{index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", devHandler="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", online="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->online:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", device=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->index:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->devHandler:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->online:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
