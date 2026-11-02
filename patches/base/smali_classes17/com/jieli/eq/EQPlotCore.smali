.class public Lcom/jieli/eq/EQPlotCore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private m_centerFreqs:[I

.field private m_eqPlotCore:J

.field private m_freq2plot:Ljava/nio/FloatBuffer;

.field private m_gain2plot:Ljava/nio/FloatBuffer;

.field private m_nplot:I

.field private m_paraHolder:J

.field private m_sosPara:[Lcom/jieli/eq/SOSPara;

.field private m_totalGain:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jl_eq"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(II[I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 v0, p1, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    iput-object p3, p0, Lcom/jieli/eq/EQPlotCore;->m_centerFreqs:[I

    new-array p2, p2, [Lcom/jieli/eq/SOSPara;

    iput-object p2, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    array-length v0, p3

    if-ge p2, v0, :cond_0

    new-instance v0, Lcom/jieli/eq/SOSPara;

    iget-object v1, p0, Lcom/jieli/eq/EQPlotCore;->m_centerFreqs:[I

    aget v1, v1, p2

    int-to-float v1, v1

    invoke-direct {v0, v1}, Lcom/jieli/eq/SOSPara;-><init>(F)V

    aput-object v0, p3, p2

    iget-object p3, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object p3, p3, p2

    invoke-virtual {p3}, Lcom/jieli/eq/SOSPara;->reset()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p3}, Lcom/jieli/eq/EQPlotCore;->allocateParaHolder([Lcom/jieli/eq/SOSPara;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/jieli/eq/EQPlotCore;->m_totalGain:F

    iput p1, p0, Lcom/jieli/eq/EQPlotCore;->m_nplot:I

    iget-object v1, p0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    const/4 v5, 0x3

    move-object v0, p0

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/jieli/eq/EQPlotCore;->allocateEQPlotCore(Ljava/nio/FloatBuffer;IJI)J

    move-result-wide p1

    iput-wide p1, v0, Lcom/jieli/eq/EQPlotCore;->m_eqPlotCore:J

    return-void
.end method

.method private native allocateEQPlotCore(Ljava/nio/FloatBuffer;IJI)J
.end method

.method private native allocateParaHolder([Lcom/jieli/eq/SOSPara;)J
.end method

.method private native getEQPlotData(Ljava/nio/FloatBuffer;JJIF)V
.end method

.method public static getLibVersionCode()I
    .locals 1

    const/16 v0, 0x2775

    return v0
.end method

.method public static getLibVersionName()Ljava/lang/String;
    .locals 1

    const-string v0, "1.1.0"

    return-object v0
.end method

.method private native nativeUpdateParaFreq(JIF)V
.end method

.method private native nativeUpdateParaGain(JIF)V
.end method

.method private native nativeUpdateParaQVal(JIF)V
.end method

.method private native nativeUpdateParaType(JII)V
.end method

.method private native releaseNativeObject(JJ)V
.end method

.method private native updateParaFreqGain(JIFF)V
.end method


# virtual methods
.method public getEQPlotData([FI)F
    .locals 8

    .line 1
    iget-object v1, p0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    iget-wide v2, p0, Lcom/jieli/eq/EQPlotCore;->m_eqPlotCore:J

    iget-wide v4, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    iget v7, p0, Lcom/jieli/eq/EQPlotCore;->m_totalGain:F

    move-object v0, p0

    move v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/jieli/eq/EQPlotCore;->getEQPlotData(Ljava/nio/FloatBuffer;JJIF)V

    .line 2
    iget-object p2, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/nio/FloatBuffer;->get(I)F

    move-result p2

    move v2, v1

    .line 3
    :goto_0
    iget v3, v0, Lcom/jieli/eq/EQPlotCore;->m_nplot:I

    if-ge v2, v3, :cond_2

    .line 4
    iget-object v3, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v3

    invoke-static {p2, v3}, Ljava/lang/Math;->max(FF)F

    move-result p2

    if-nez v2, :cond_0

    .line 5
    iget-object v3, v0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v3

    aput v3, p1, v1

    .line 6
    iget-object v3, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v3

    const/4 v4, 0x1

    aput v3, p1, v4

    goto :goto_1

    .line 7
    :cond_0
    iget v3, v0, Lcom/jieli/eq/EQPlotCore;->m_nplot:I

    add-int/lit8 v4, v3, -0x1

    if-ne v2, v4, :cond_1

    mul-int/lit8 v3, v3, 0x4

    add-int/lit8 v3, v3, -0x6

    .line 8
    iget-object v4, v0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v4

    aput v4, p1, v3

    .line 9
    iget v3, v0, Lcom/jieli/eq/EQPlotCore;->m_nplot:I

    mul-int/lit8 v3, v3, 0x4

    add-int/lit8 v3, v3, -0x5

    iget-object v4, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v4

    aput v4, p1, v3

    goto :goto_1

    :cond_1
    mul-int/lit8 v3, v2, 0x4

    add-int/lit8 v4, v3, -0x2

    .line 10
    iget-object v5, v0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v5, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v5

    aput v5, p1, v4

    add-int/lit8 v4, v3, -0x1

    .line 11
    iget-object v5, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v5, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v5

    aput v5, p1, v4

    .line 12
    iget-object v4, v0, Lcom/jieli/eq/EQPlotCore;->m_freq2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v4

    aput v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    .line 13
    iget-object v4, v0, Lcom/jieli/eq/EQPlotCore;->m_gain2plot:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v4

    aput v4, p1, v3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return p2
.end method

.method public getPara(I)Lcom/jieli/eq/SOSPara;
    .locals 1

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getSOSPara()[Lcom/jieli/eq/SOSPara;
    .locals 1

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    return-object v0
.end method

.method public releaseNativeObject()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_eqPlotCore:J

    iget-wide v2, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/jieli/eq/EQPlotCore;->releaseNativeObject(JJ)V

    return-void
.end method

.method public setTotalGain(F)V
    .locals 0

    iput p1, p0, Lcom/jieli/eq/EQPlotCore;->m_totalGain:F

    return-void
.end method

.method public syncPara(I)V
    .locals 3

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    iget-object v2, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v2, v2, p1

    iget v2, v2, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaFreq(JIF)V

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    iget-object v2, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v2, v2, p1

    iget v2, v2, Lcom/jieli/eq/SOSPara;->gain:F

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaGain(JIF)V

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    iget-object v2, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v2, v2, p1

    iget v2, v2, Lcom/jieli/eq/SOSPara;->qValue:F

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaQVal(JIF)V

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    iget-object v2, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v2, v2, p1

    iget v2, v2, Lcom/jieli/eq/SOSPara;->type:I

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaType(JII)V

    return-void
.end method

.method public updatePara(IFF)V
    .locals 7

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v0, v0, p1

    iput p2, v0, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    iput p3, v0, Lcom/jieli/eq/SOSPara;->gain:F

    iget-wide v2, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    move-object v1, p0

    move v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/jieli/eq/EQPlotCore;->updateParaFreqGain(JIFF)V

    return-void
.end method

.method public updateParaFreq(IF)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v0, v0, p1

    iput p2, v0, Lcom/jieli/eq/SOSPara;->centerFrequency:F

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaFreq(JIF)V

    return-void
.end method

.method public updateParaGain(IF)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v0, v0, p1

    iput p2, v0, Lcom/jieli/eq/SOSPara;->gain:F

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaGain(JIF)V

    return-void
.end method

.method public updateParaQVal(IF)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v0, v0, p1

    iput p2, v0, Lcom/jieli/eq/SOSPara;->qValue:F

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaQVal(JIF)V

    return-void
.end method

.method public updateParaType(II)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/eq/EQPlotCore;->m_sosPara:[Lcom/jieli/eq/SOSPara;

    aget-object v0, v0, p1

    iput p2, v0, Lcom/jieli/eq/SOSPara;->type:I

    iget-wide v0, p0, Lcom/jieli/eq/EQPlotCore;->m_paraHolder:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jieli/eq/EQPlotCore;->nativeUpdateParaType(JII)V

    return-void
.end method
