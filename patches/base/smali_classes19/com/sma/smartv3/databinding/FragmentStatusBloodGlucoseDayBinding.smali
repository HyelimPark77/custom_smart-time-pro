.class public final Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final avValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final avValueTV:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final avValueUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final beforeTime:Landroid/widget/ImageButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final dataContent:Landroid/widget/LinearLayout;
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

.field public final llAvgValue:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llMaxValue:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llMinValue:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llMonitoringResultsValue:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final loading:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final maxValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final maxValueTV:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final maxValueUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final minValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final minValueTV:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final minValueUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final monitoringResultsValue:Lcom/sma/smartv3/view/text/DINCondBold;
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

.field private final rootView:Landroid/widget/LinearLayout;
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


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageButton;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Landroidx/core/widget/NestedScrollView;Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/text/DINCondBold;
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
    .param p6    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/github/mikephil/charting/charts/LineChart;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/RelativeLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p15    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p16    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p18    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p19    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p20    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p21    # Landroid/widget/ImageButton;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p22    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p23    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p24    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p25    # Landroidx/core/widget/NestedScrollView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p26    # Lcom/sma/smartv3/view/text/PFMedium;
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
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView",
            "avValue",
            "avValueTV",
            "avValueUnit",
            "beforeTime",
            "dataContent",
            "image",
            "lineChart",
            "llAvgValue",
            "llMaxValue",
            "llMinValue",
            "llMonitoringResultsValue",
            "loading",
            "maxValue",
            "maxValueTV",
            "maxValueUnit",
            "minValue",
            "minValueTV",
            "minValueUnit",
            "monitoringResultsValue",
            "nextTime",
            "nowTime",
            "nowTimeDetails",
            "nowValue",
            "scrollView",
            "valueUnit"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->avValue:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->avValueTV:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->avValueUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->beforeTime:Landroid/widget/ImageButton;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->dataContent:Landroid/widget/LinearLayout;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->image:Landroid/widget/ImageView;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->llAvgValue:Landroid/widget/LinearLayout;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->llMaxValue:Landroid/widget/LinearLayout;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->llMinValue:Landroid/widget/LinearLayout;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->llMonitoringResultsValue:Landroid/widget/LinearLayout;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->loading:Landroid/widget/RelativeLayout;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->maxValue:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->maxValueTV:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->maxValueUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->minValue:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->minValueTV:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->minValueUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->monitoringResultsValue:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->nextTime:Landroid/widget/ImageButton;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->nowTime:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->nowTimeDetails:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->nowValue:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->scrollView:Landroidx/core/widget/NestedScrollView;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->valueUnit:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;
    .locals 30
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

    const v1, 0x7f0a00f4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v5, :cond_0

    const v1, 0x7f0a00f5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v6, :cond_0

    const v1, 0x7f0a00f6

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v7, :cond_0

    const v1, 0x7f0a0110

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/ImageButton;

    if-eqz v8, :cond_0

    const v1, 0x7f0a02ca

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/LinearLayout;

    if-eqz v9, :cond_0

    const v1, 0x7f0a045a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    const v1, 0x7f0a06a8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/github/mikephil/charting/charts/LineChart;

    if-eqz v11, :cond_0

    const v1, 0x7f0a06d1

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/LinearLayout;

    if-eqz v12, :cond_0

    const v1, 0x7f0a0704

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/LinearLayout;

    if-eqz v13, :cond_0

    const v1, 0x7f0a0708

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/LinearLayout;

    if-eqz v14, :cond_0

    const v1, 0x7f0a070b

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/LinearLayout;

    if-eqz v15, :cond_0

    const v1, 0x7f0a073a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/RelativeLayout;

    if-eqz v16, :cond_0

    const v1, 0x7f0a0768

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v17, :cond_0

    const v1, 0x7f0a0769

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v18, :cond_0

    const v1, 0x7f0a076a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v19, :cond_0

    const v1, 0x7f0a083a

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v20, :cond_0

    const v1, 0x7f0a083b

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v21, :cond_0

    const v1, 0x7f0a083c

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v22, :cond_0

    const v1, 0x7f0a083e

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v23, :cond_0

    const v1, 0x7f0a0893

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Landroid/widget/ImageButton;

    if-eqz v24, :cond_0

    const v1, 0x7f0a08a4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v25, :cond_0

    const v1, 0x7f0a08a5

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v26, :cond_0

    const v1, 0x7f0a08a7

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v27, :cond_0

    const v1, 0x7f0a09e9

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Landroidx/core/widget/NestedScrollView;

    if-eqz v28, :cond_0

    const v1, 0x7f0a18e8

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v29, :cond_0

    new-instance v3, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-direct/range {v3 .. v29}, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Landroid/widget/ImageButton;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Landroid/widget/ImageButton;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Landroidx/core/widget/NestedScrollView;Lcom/sma/smartv3/view/text/PFMedium;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;
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

    const v0, 0x7f0d0e91

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/FragmentStatusBloodGlucoseDayBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
