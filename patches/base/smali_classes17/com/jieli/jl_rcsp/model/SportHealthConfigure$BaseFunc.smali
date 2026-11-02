.class public abstract Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/SportHealthConfigure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "BaseFunc"
.end annotation


# instance fields
.field private final type:I


# direct methods
.method public constructor <init>(II[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;->type:I

    invoke-virtual {p0, p2, p3}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;->parseData(I[B)V

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;->type:I

    return v0
.end method

.method public abstract parseData(I[B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation
.end method
