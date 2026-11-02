.class public final Lcom/bestmafen/baseble/scanner/BleDevice;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private mAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private transient mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRssi:I

.field private mScanRecord:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mType:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAddress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    iput-object p3, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    iput-object p4, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    iput p5, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    iput-object p6, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/bestmafen/baseble/scanner/BleDevice;Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcom/bestmafen/baseble/scanner/BleDevice;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/bestmafen/baseble/scanner/BleDevice;->copy(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)Lcom/bestmafen/baseble/scanner/BleDevice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    return v0
.end method

.method public final component3()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)Lcom/bestmafen/baseble/scanner/BleDevice;
    .locals 8
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mBluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAddress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/bestmafen/baseble/scanner/BleDevice;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/bestmafen/baseble/scanner/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    instance-of v0, p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    check-cast p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    iget-object p1, p1, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getMAddress()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final getMName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRssi()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    return v0
.end method

.method public final getMScanRecord()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setMAddress(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    return-void
.end method

.method public final setMBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mBluetoothDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method public final setMName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    return-void
.end method

.method public final setMRssi(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    return-void
.end method

.method public final setMScanRecord([B)V
    .locals 0
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleDevice(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mRssi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mRssi:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mScanRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bestmafen/baseble/scanner/BleDevice;->mScanRecord:[B

    invoke-static {v1}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
