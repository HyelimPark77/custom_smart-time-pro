.class public final Lcom/szabh/smable3/entity/BleMatchPlayer;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchPlayer$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchPlayer$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1c

.field public static final NAME_LENGTH:I = 0x19


# instance fields
.field private hasYellowCard:I

.field private isCaptain:I

.field private mName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mNum:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchPlayer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchPlayer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchPlayer;->Companion:Lcom/szabh/smable3/entity/BleMatchPlayer$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleMatchPlayer;-><init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 7
    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleMatchPlayer;-><init>(Ljava/lang/String;III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchPlayer;Ljava/lang/String;IIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchPlayer;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleMatchPlayer;->copy(Ljava/lang/String;III)Lcom/szabh/smable3/entity/BleMatchPlayer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    return v0
.end method

.method public final copy(Ljava/lang/String;III)Lcom/szabh/smable3/entity/BleMatchPlayer;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchPlayer;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleMatchPlayer;-><init>(Ljava/lang/String;III)V

    return-object v0
.end method

.method public encode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x19

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v1, v0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchPlayer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchPlayer;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHasYellowCard()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method

.method public final getMName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMNum()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCaptain()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    return v0
.end method

.method public final setCaptain(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    return-void
.end method

.method public final setHasYellowCard(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    return-void
.end method

.method public final setMNum(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchPlayer(mName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->mNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasYellowCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->hasYellowCard:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isCaptain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchPlayer;->isCaptain:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
