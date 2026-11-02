.class public final Lcom/sma/smartv3/databinding/ActivityWeatherBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final flBg:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final flContainer:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivWeather:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivWeather1:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivWeather2:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivWeather3:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvCityName:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvHumidityValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvPrecipitationUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvPrecipitationValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTemperatureMax:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTemperatureMin:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTemperatureUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTemperatureValue:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvUviValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvVisibilityUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvVisibilityValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherDate1:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherDate2:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherDate3:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherName:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherValue1:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherValue2:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWeatherValue3:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWindSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvWindSpeedValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 0
    .param p1    # Landroid/widget/FrameLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/FrameLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/FrameLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Lcom/sma/smartv3/view/text/DINCondBold;
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
    .param p16    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p17    # Lcom/sma/smartv3/view/text/PFMedium;
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
    .param p20    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p21    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p22    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p23    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p24    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p25    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p26    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p27    # Lcom/sma/smartv3/view/text/PFMedium;
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
            0x0,
            0x0
        }
        names = {
            "rootView",
            "flBg",
            "flContainer",
            "ivWeather",
            "ivWeather1",
            "ivWeather2",
            "ivWeather3",
            "tvCityName",
            "tvHumidityValue",
            "tvPrecipitationUnit",
            "tvPrecipitationValue",
            "tvTemperatureMax",
            "tvTemperatureMin",
            "tvTemperatureUnit",
            "tvTemperatureValue",
            "tvUviValue",
            "tvVisibilityUnit",
            "tvVisibilityValue",
            "tvWeatherDate1",
            "tvWeatherDate2",
            "tvWeatherDate3",
            "tvWeatherName",
            "tvWeatherValue1",
            "tvWeatherValue2",
            "tvWeatherValue3",
            "tvWindSpeedUnit",
            "tvWindSpeedValue"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->rootView:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->flBg:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->flContainer:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->ivWeather:Landroid/widget/ImageView;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->ivWeather1:Landroid/widget/ImageView;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->ivWeather2:Landroid/widget/ImageView;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->ivWeather3:Landroid/widget/ImageView;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvCityName:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvHumidityValue:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvPrecipitationUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvPrecipitationValue:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvTemperatureMax:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvTemperatureMin:Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvTemperatureUnit:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p15, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvTemperatureValue:Lcom/sma/smartv3/view/text/DINCondBold;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvUviValue:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvVisibilityUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvVisibilityValue:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherDate1:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherDate2:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherDate3:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherName:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherValue1:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherValue2:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWeatherValue3:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWindSpeedUnit:Lcom/sma/smartv3/view/text/PFMedium;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->tvWindSpeedValue:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityWeatherBinding;
    .locals 28
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

    move-object v1, v0

    check-cast v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0a03e1

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_0

    const v2, 0x7f0a0674

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    const v2, 0x7f0a0675

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    const v2, 0x7f0a0676

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    const v2, 0x7f0a0677

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    const v2, 0x7f0a0c51

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v8, :cond_0

    const v2, 0x7f0a0c99

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v9, :cond_0

    const v2, 0x7f0a0cec

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v10, :cond_0

    const v2, 0x7f0a0ced

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v11, :cond_0

    const v2, 0x7f0a0d1e

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v12, :cond_0

    const v2, 0x7f0a0d1f

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v13, :cond_0

    const v2, 0x7f0a0d20

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v14, :cond_0

    const v2, 0x7f0a0d21

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v15, :cond_0

    const v2, 0x7f0a18af

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v16, :cond_0

    const v2, 0x7f0a18b6

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v17, :cond_0

    const v2, 0x7f0a18b7

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    check-cast v18, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v18, :cond_0

    const v2, 0x7f0a18b8

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    check-cast v19, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v19, :cond_0

    const v2, 0x7f0a18b9

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v20

    check-cast v20, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v20, :cond_0

    const v2, 0x7f0a18ba

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v21

    check-cast v21, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v21, :cond_0

    const v2, 0x7f0a18bf

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v22

    check-cast v22, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v22, :cond_0

    const v2, 0x7f0a18c0

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v23, :cond_0

    const v2, 0x7f0a18c1

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v24

    check-cast v24, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v24, :cond_0

    const v2, 0x7f0a18c2

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v25

    check-cast v25, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v25, :cond_0

    const v2, 0x7f0a18cb

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v26

    check-cast v26, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v26, :cond_0

    const v2, 0x7f0a18cc

    invoke-static {v0, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v27

    check-cast v27, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v27, :cond_0

    new-instance v0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v27}, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/DINCondBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityWeatherBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityWeatherBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityWeatherBinding;
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

    const v0, 0x7f0d013e

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityWeatherBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/FrameLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityWeatherBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method
