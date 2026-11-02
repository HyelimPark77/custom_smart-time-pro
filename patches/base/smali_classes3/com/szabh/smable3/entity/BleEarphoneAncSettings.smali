.class public final Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleEarphoneAncSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleEarphoneAncSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,98:1\n232#2,3:99\n222#2,15:102\n*S KotlinDebug\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n*L\n83#1:99,3\n83#1:102,15\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleEarphoneAncSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,98:1\n232#2,3:99\n222#2,15:102\n*S KotlinDebug\n*F\n+ 1 BleEarphoneAncSettings.kt\ncom/szabh/smable3/entity/BleEarphoneAncSettings\n*L\n83#1:99,3\n83#1:102,15\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleEarphoneAncSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1a

.field public static final MODE_CLOSE:I = 0x0

.field public static final MODE_DENOISE:I = 0x1

.field public static final MODE_TRANSPARENT:I = 0x2


# instance fields
.field private mAncModeList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;"
        }
    .end annotation
.end field

.field private mMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->Companion:Lcom/szabh/smable3/entity/BleEarphoneAncSettings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mAncModeList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    new-instance p2, Lcom/szabh/smable3/entity/BleAncMode;

    invoke-direct {p2, v0, v0, v0, v0}, Lcom/szabh/smable3/entity/BleAncMode;-><init>(IIII)V

    .line 6
    new-instance p3, Lcom/szabh/smable3/entity/BleAncMode;

    const/16 p4, 0x4000

    const/16 v0, 0x1f40

    invoke-direct {p3, p4, p4, v0, v0}, Lcom/szabh/smable3/entity/BleAncMode;-><init>(IIII)V

    .line 7
    new-instance v1, Lcom/szabh/smable3/entity/BleAncMode;

    invoke-direct {v1, p4, p4, v0, v0}, Lcom/szabh/smable3/entity/BleAncMode;-><init>(IIII)V

    filled-new-array {p2, p3, v1}, [Lcom/szabh/smable3/entity/BleAncMode;

    move-result-object p2

    .line 8
    invoke-static {p2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleEarphoneAncSettings;ILjava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->copy(ILjava/util/List;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/util/List;)Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleEarphoneAncSettings;"
        }
    .end annotation

    const-string v0, "mAncModeList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    const-class v2, Lcom/szabh/smable3/entity/BleAncMode;

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v3, 0x8

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v2}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMAncModeList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x1a

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAncModeList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAncMode;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleEarphoneAncSettings(mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAncModeList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneAncSettings;->mAncModeList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
