.class public final Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleSMSQuickReplyContent$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_MAX_LENGTH:I = 0x3c

.field public static final Companion:Lcom/szabh/smable3/entity/BleSMSQuickReplyContent$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x3d


# instance fields
.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->Companion:Lcom/szabh/smable3/entity/BleSMSQuickReplyContent$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    const-string p1, ""

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->copy(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public encode()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v3, 0x3c

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x3d

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSMSQuickReplyContent(mId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\',mContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
