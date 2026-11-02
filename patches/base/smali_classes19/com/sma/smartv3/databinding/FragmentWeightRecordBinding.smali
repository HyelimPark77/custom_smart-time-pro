.class public final Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final beforeTime:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final bmiEvaluation:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final bmiValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final bodyFatScaleBt:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final changeBt:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final dataContent:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final deleteBt:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final image:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final lineChart:Lcom/github/mikephil/charting/charts/LineChart;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llBottomTool:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final loading:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nextTime:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nowTime:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nowTimeDetails:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final nowValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView_:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final scrollView:Landroidx/core/widget/NestedScrollView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final valueUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final weightUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/LinearLayout;Landroid/widget/ImageButton;Landroid/widget/ImageView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;Landroidx/core/widget/NestedScrollView;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/github/mikephil/charting/charts/LineChart;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p19    # Landroidx/core/widget/NestedScrollView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p20    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p21    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView_",
            "beforeTime",
            "bmiEvaluation",
            "bmiValue",
            "bodyFatScaleBt",
            "changeBt",
            "dataContent",
            "deleteBt",
            "image",
            "lineChart",
            "llBottomTool",
            "loading",
            "nextTime",
            "nowTime",
            "nowTimeDetails",
            "nowValue",
            "rootView",
            "sbvBmi",
            "scrollView",
            "valueUnit",
            "weightUnit"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->rootView_:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->beforeTime:Landroid/widget/ImageButton;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->bmiEvaluation:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->bmiValue:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->bodyFatScaleBt:Landroid/widget/ImageButton;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->changeBt:Landroid/widget/ImageButton;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->dataContent:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->deleteBt:Landroid/widget/ImageButton;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->image:Landroid/widget/ImageView;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->llBottomTool:Landroid/widget/LinearLayout;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->loading:Landroid/widget/RelativeLayout;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->nextTime:Landroid/widget/ImageButton;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->nowTime:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->nowTimeDetails:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->nowValue:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->rootView:Landroid/widget/LinearLayout;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->sbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->scrollView:Landroidx/core/widget/NestedScrollView;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->valueUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->weightUnit:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;
    .locals 25
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rootView"
        }
    .end annotation

    move-object/from16 v0, p0

    const v1, 0x7f0a0110

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/ImageButton;

    if-eqz v5, :cond_0

    const v1, 0x7f0a015c

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v6, :cond_0

    const v1, 0x7f0a015d

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v7, :cond_0

    const v1, 0x7f0a015f

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/ImageButton;

    if-eqz v8, :cond_0

    const v1, 0x7f0a0222

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/ImageButton;

    if-eqz v9, :cond_0

    const v1, 0x7f0a02ca

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    const v1, 0x7f0a02e2

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/ImageButton;

    if-eqz v11, :cond_0

    const v1, 0x7f0a045a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    const v1, 0x7f0a06a8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v13, :cond_0

    const v1, 0x7f0a06d5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/LinearLayout;

    if-eqz v14, :cond_0

    const v1, 0x7f0a073a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/RelativeLayout;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0893

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/ImageButton;

    if-eqz v16, :cond_0

    const v1, 0x7f0a08a4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v17, :cond_0

    const v1, 0x7f0a08a5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v18, :cond_0

    const v1, 0x7f0a08a7

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v19, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const v1, 0x7f0a09e0

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    if-eqz v21, :cond_0

    const v1, 0x7f0a09e9

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Landroidx/core/widget/NestedScrollView;

    if-eqz v22, :cond_0

    const v1, 0x7f0a18e8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v23, :cond_0

    const v1, 0x7f0a193e

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v24, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;

    move-object/from16 v20, v4

    invoke-direct/range {v3 .. v24}, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageButton;Landroid/widget/ImageButton;Landroid/widget/LinearLayout;Landroid/widget/ImageButton;Landroid/widget/ImageView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;Landroidx/core/widget/NestedScrollView;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "parent",
            "attachToParent"
        }
    .end annotation

    const v0, 0x7f0d0ea9

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/FragmentWeightRecordBinding;->rootView_:Landroid/widget/LinearLayout;

    return-object v0
.end method
