.class public Lcom/szabh/smable3/entity/BleIdObject;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIdObject;->mId:I

    return v0
.end method

.method public final setMId(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIdObject;->mId:I

    return-void
.end method
