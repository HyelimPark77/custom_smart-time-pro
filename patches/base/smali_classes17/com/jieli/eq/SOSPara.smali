.class public Lcom/jieli/eq/SOSPara;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field public centerFrequency:F

.field public enable:Z

.field public gain:F

.field private m_defaultFreq:F

.field public qValue:F

.field public type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/jieli/eq/SOSPara;->enable:Z

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/jieli/eq/SOSPara;->m_defaultFreq:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/jieli/eq/SOSPara;->enable:Z

    .line 3
    iput p1, p0, Lcom/jieli/eq/SOSPara;->m_defaultFreq:F

    .line 4
    iput p1, p0, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    return-void
.end method


# virtual methods
.method public copy(Lcom/jieli/eq/SOSPara;)V
    .locals 1

    iget v0, p1, Lcom/jieli/eq/SOSPara;->type:I

    iput v0, p0, Lcom/jieli/eq/SOSPara;->type:I

    iget v0, p1, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    iput v0, p0, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    iget v0, p1, Lcom/jieli/eq/SOSPara;->gain:F

    iput v0, p0, Lcom/jieli/eq/SOSPara;->gain:F

    iget v0, p1, Lcom/jieli/eq/SOSPara;->qValue:F

    iput v0, p0, Lcom/jieli/eq/SOSPara;->qValue:F

    iget-boolean p1, p1, Lcom/jieli/eq/SOSPara;->enable:Z

    iput-boolean p1, p0, Lcom/jieli/eq/SOSPara;->enable:Z

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/jieli/eq/SOSPara;->type:I

    iget v0, p0, Lcom/jieli/eq/SOSPara;->m_defaultFreq:F

    iput v0, p0, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/eq/SOSPara;->gain:F

    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/jieli/eq/SOSPara;->qValue:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/eq/SOSPara;->enable:Z

    return-void
.end method
