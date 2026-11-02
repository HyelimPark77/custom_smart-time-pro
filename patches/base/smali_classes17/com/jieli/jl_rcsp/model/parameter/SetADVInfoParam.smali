.class public Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private payload:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;->payload:[B

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;->payload:[B

    return-object v0
.end method

.method public getPayload()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;->payload:[B

    return-object v0
.end method

.method public setPayload([B)Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;->payload:[B

    return-object p0
.end method
