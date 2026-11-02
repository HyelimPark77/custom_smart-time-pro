.class public Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;


# static fields
.field public static final MODE_HIGH:I = 0x3

.field public static final MODE_MIDDLE:I = 0x2

.field public static final MODE_NORMAL:I = 0x1

.field public static final MODE_RELAX:I


# instance fields
.field private enable:Z

.field private mode:B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->parseData([B)V

    return-void
.end method

.method private parseData([B)V
    .locals 3

    if-eqz p1, :cond_2

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v0, v2

    :cond_1
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->enable:Z

    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    aget-byte p1, p1, v2

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->mode:B

    :cond_2
    :goto_0
    return-void
.end method

.method private toData()[B
    .locals 4

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->enable:Z

    int-to-byte v0, v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->mode:B

    const/4 v2, 0x2

    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte v0, v2, v3

    const/4 v0, 0x1

    aput-byte v1, v2, v0

    return-object v2
.end method


# virtual methods
.method public getMode()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->mode:B

    return v0
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public isEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->enable:Z

    return v0
.end method

.method public setEnable(Z)Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->enable:Z

    return-object p0
.end method

.method public setMode(B)Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->mode:B

    return-object p0
.end method

.method public toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->getType()I

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AutomaticPressureDetection{enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/health/AutomaticPressureDetection;->mode:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
