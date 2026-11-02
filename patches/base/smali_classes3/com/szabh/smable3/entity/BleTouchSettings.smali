.class public final Lcom/szabh/smable3/entity/BleTouchSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleTouchSettings$Companion;
    }
.end annotation


# static fields
.field public static final CUSTOM_DOUBLE:I = 0x1

.field public static final CUSTOM_MUSIC_NEXT:I = 0xa

.field public static final CUSTOM_MUSIC_PLAY_PAUSE:I = 0xb

.field public static final CUSTOM_MUSIC_PREV:I = 0x9

.field public static final CUSTOM_NONE:I = 0x0

.field public static final CUSTOM_SWIPE_BACK:I = 0x6

.field public static final CUSTOM_SWIPE_DOWN:I = 0x3

.field public static final CUSTOM_SWIPE_LEFT:I = 0x4

.field public static final CUSTOM_SWIPE_RIGHT:I = 0x5

.field public static final CUSTOM_SWIPE_UP:I = 0x2

.field public static final CUSTOM_VOL_DEC:I = 0x8

.field public static final CUSTOM_VOL_INC:I = 0x7

.field public static final Companion:Lcom/szabh/smable3/entity/BleTouchSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x8

.field public static final TYPE_CUSTOM:I = 0x3

.field public static final TYPE_MUSIC:I = 0x0

.field public static final TYPE_PHOTO:I = 0x1

.field public static final TYPE_SLIDE:I = 0x2


# instance fields
.field private mCustomDouble:I

.field private mCustomLong:I

.field private mCustomSingle:I

.field private mEnabled:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleTouchSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleTouchSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleTouchSettings;->Companion:Lcom/szabh/smable3/entity/BleTouchSettings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleTouchSettings;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BleTouchSettings;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleTouchSettings;IIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleTouchSettings;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleTouchSettings;->copy(IIIII)Lcom/szabh/smable3/entity/BleTouchSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    return v0
.end method

.method public final copy(IIIII)Lcom/szabh/smable3/entity/BleTouchSettings;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleTouchSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleTouchSettings;-><init>(IIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleTouchSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleTouchSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMCustomDouble()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    return v0
.end method

.method public final getMCustomLong()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    return v0
.end method

.method public final getMCustomSingle()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    return v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCustomDouble(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    return-void
.end method

.method public final setMCustomLong(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    return-void
.end method

.method public final setMCustomSingle(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    return-void
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleTouchSettings(mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCustomSingle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomSingle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCustomDouble="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomDouble:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCustomLong="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleTouchSettings;->mCustomLong:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
