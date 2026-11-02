.class public Lcom/szabh/smable3/entity/BleGolfMapCache;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private final ITEM_HEADER_LENGTH:I

.field private mGolfCourseId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->mGolfCourseId:Ljava/lang/String;

    const/16 v0, 0x8

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->ITEM_HEADER_LENGTH:I

    return-void
.end method


# virtual methods
.method public encode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->mGolfCourseId:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    return-void
.end method

.method public final getITEM_HEADER_LENGTH()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->ITEM_HEADER_LENGTH:I

    return v0
.end method

.method public final getMGolfCourseId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->mGolfCourseId:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->ITEM_HEADER_LENGTH:I

    return v0
.end method

.method public final setMGolfCourseId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->mGolfCourseId:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGolfMapCache(mGolfCourseId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfMapCache;->mGolfCourseId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
